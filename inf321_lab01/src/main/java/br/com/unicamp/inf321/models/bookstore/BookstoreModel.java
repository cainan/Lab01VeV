package br.com.unicamp.inf321.models.bookstore;

import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.GraphWalker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.unicamp.inf321.ModeloGrupo8;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

@GraphWalker(value = "random(edge_coverage(100))", start = "v_Home")
public class BookstoreModel extends ExecutionContext implements ModeloGrupo8 {

	private AndroidDriver<WebElement> driver;
	private WebDriverWait wait;

	public BookstoreModel() {
	}

	public BookstoreModel(AndroidDriver<WebElement> driver) {
		super();
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
	}

	@Override
	public void e_finalizarComBoleto() {
		// TODO Auto-generated method stub

	}

	@Override
	public void v_Erro() {
		// TODO Auto-generated method stub

	}

	@Override
	public void v_PagamentoBoleto() {
		// TODO Auto-generated method stub

	}

	@Override
	public void v_PagamentoFinalizado() {
		// TODO Auto-generated method stub

	}

	@Override
	public void e_finalizarCompra() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Image")));
		TouchAction touchAction = new TouchAction(driver);
		touchAction.press(1000,600).perform();
    	touchAction.moveTo(0,50).perform();
    	touchAction.tap(1072, 365).perform();

	}

	@Override
	public void v_popupErro() {
		// TODO Auto-generated method stub

	}

	@Override
	public void e_pagarComBoleto() {
		// TODO Auto-generated method stub

	}

	@Override
	public void v_RealizarLogin() {
		// TODO Auto-generated method stub

	}

	@Override
	public void v_SelecaoDeEndereco() {
		// TODO Auto-generated method stub

	}

	@Override
	public void e_aplicarEndereco() {
		// TODO Auto-generated method stub

	}

	@Override
	public void e_logar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void e_pagarComCartaoCredito() {
		// TODO Auto-generated method stub

	}

	@Override
	public void v_Home() {
	}

	@Override
	public void e_adicionarProduto() {
		// TODO Auto-generated method stub

	}

	@Override
	public void v_IPO() {
		// TODO Auto-generated method stub

	}

	@Override
	public void e_concluirCompra() {
		// TODO Auto-generated method stub

	}

	@Override
	public void e_selecionarEndereco() {
		// TODO Auto-generated method stub

	}

	@Override
	public void v_ExibirModalidadesEntrega() {
		// TODO Auto-generated method stub

	}

	@Override
	public void e_realizarPagamento() {
		// TODO Auto-generated method stub

	}

	@Override
	public void e_removerProduto() {
		// TODO Auto-generated method stub

	}

	@Override
	public void e_pesquisar() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Image")));
		TouchAction touchAction = new TouchAction(driver);
    	touchAction.tap(285, 229).perform();
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  
    	touchAction.tap(285, 229).perform();
    	touchAction.tap(1138, 216).perform();
    	touchAction.tap(188, 640).perform();
	}

	@Override
	public void v_PagamentoCartaoCredito() {
		// TODO Auto-generated method stub

	}

	@Override
	public void e_finalizarComCartao() {
		

	}

	@Override
	public void e_selecionar() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Image")));
		TouchAction touchAction = new TouchAction(driver);
    	touchAction.tap(837, 558).perform();

	}

	@Override
	public void e_voltarLogado() {
		// TODO Auto-generated method stub

	}

	@Override
	public void e_pesquisa() {
		// TODO Auto-generated method stub

	}

	@Override
	public void e_rejeitarPagamento() {
		// TODO Auto-generated method stub

	}

	@Override
	public void e_voltarHome() {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Image")));
//		TouchAction touchAction = new TouchAction(driver);
//		touchAction.tap(60, 86).perform();
	}

	@Override
	public void v_FinalizarCompra() {
		// TODO Auto-generated method stub

	}

	@Override
	public void v_Carrinho() {
		// TODO Auto-generated method stub

	}

	@Override
	public void e_aprovarPagamento() {
		// TODO Auto-generated method stub

	}

	@Override
	public void e_voltar() {

	}

	@Override
	public void e_Init() {
		System.out.println("Teste");

	}

	@Override
	public void v_ListaProdutos() {
		// TODO Auto-generated method stub

	}

	@Override
	public void v_ErroTexto() {
		// TODO Auto-generated method stub

	}

	@Override
	public void e_pesquisa_texto() {
		// TODO Auto-generated method stub

	}

	@Override
	public void e_pesquisar_texto() {
		// TODO Auto-generated method stub

	}

}
