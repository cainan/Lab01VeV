package br.com.unicamp.inf321;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.assertj.core.api.Assertions;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.stream.file.FileSinkImages;
import org.graphstream.stream.file.FileSinkImages.LayoutPolicy;
import org.graphstream.stream.file.FileSinkImages.OutputType;
import org.graphstream.stream.file.FileSinkImages.RendererType;
import org.graphstream.stream.file.FileSinkImages.Resolutions;
import org.graphwalker.core.condition.EdgeCoverage;
import org.graphwalker.core.condition.ReachedVertex;
import org.graphwalker.core.condition.TimeDuration;
import org.graphwalker.core.event.Observer;
import org.graphwalker.core.generator.AStarPath;
import org.graphwalker.core.generator.RandomPath;
import org.graphwalker.java.test.Result;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import br.com.unicamp.inf321.helper.GraphWalkerTestBuilder;
import br.com.unicamp.inf321.models.bookstore.BookstoreModel;
import br.com.unicamp.inf321.observers.GraphStreamObserver;

public class ModeloGrupo8Test {
	
	public final static Path MODEL_PATH = Paths.get("/br/com/unicamp/inf321/ModeloGrupo8.graphml");
	private Observer observer;
	private Graph graph;
	
	@Rule
	public TestName testName = new TestName();
	
	@Before
	public void beforeTest() {
		System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
		graph = new MultiGraph(ModeloGrupo8Test.class.getSimpleName() + "_" + testName.getMethodName());
		graph.display(true);
		observer = new GraphStreamObserver(graph);
	}

	@After
	public void afterTest() throws Exception {
		FileSinkImages pic = new FileSinkImages(OutputType.JPG, Resolutions.HD720);
		pic.setLayoutPolicy(LayoutPolicy.COMPUTED_FULLY_AT_NEW_IMAGE);
		pic.setRenderer(RendererType.SCALA);
		pic.stabilizeLayout(1);
		pic.setAutofit(true);
		pic.writeAll(graph, "screenshots/" + ModeloGrupo8Test.class.getSimpleName() + "_graphstream_" + testName.getMethodName() + ".jpg");
	}
	
	@Test
	public void runSmokeTest() {
		Result result = new GraphWalkerTestBuilder()
				.addModel(MODEL_PATH,
						new AStarPath(new ReachedVertex("v_Home")), new BookstoreModel())
				.addObserver(observer)
				.execute(true);
		Assertions.assertThat(result.getErrors()).as("Errors: [" + String.join(", ", result.getErrors()) + "]").isNullOrEmpty();
	}

	@Test
	public void runStabilityTest() {
		Result result = new GraphWalkerTestBuilder()
				.addModel(MODEL_PATH,
						new RandomPath(new TimeDuration(30, TimeUnit.SECONDS)), new BookstoreModel())
				.addObserver(observer)
				.execute(true);
		Assertions.assertThat(result.getErrors()).as("Errors: [" + String.join(", ", result.getErrors()) + "]").isNullOrEmpty();
	}

	@Test
	public void runFunctionalTest() {
		Result result = new GraphWalkerTestBuilder()
				.addModel(MODEL_PATH, new RandomPath(new EdgeCoverage(100)), new BookstoreModel())
				.addObserver(observer)
				.execute(true);
		Assertions.assertThat(result.getErrors()).as("Errors: [" + String.join(", ", result.getErrors()) + "]").isNullOrEmpty();
	}

}
