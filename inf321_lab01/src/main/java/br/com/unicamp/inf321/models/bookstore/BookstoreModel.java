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
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Image")));
		TouchAction touchAction = new TouchAction(driver);
    	touchAction.tap(105, 70).perform();

	}

	@Override
	public void v_PagamentoBoleto() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Image")));
		TouchAction touchAction = new TouchAction(driver);
    	touchAction.tap(1072, 365).perform();

	}

	@Override
	public void v_PagamentoFinalizado() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Image")));
		TouchAction touchAction = new TouchAction(driver);
    	touchAction.tap(1072, 365).perform();

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
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Image")));
		TouchAction touchAction = new TouchAction(driver);
    	touchAction.tap(105, 70).perform();

	}

	@Override
	public void e_pagarComBoleto() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Image")));
		TouchAction touchAction = new TouchAction(driver);
    	touchAction.tap(1072, 365).perform();
	}

	@Override
	public void v_RealizarLogin() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Image")));
		TouchAction touchAction = new TouchAction(driver);
    	touchAction.tap(122,508).perform();

	}

	@Override
	public void v_SelecaoDeEndereco() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Image")));
		TouchAction touchAction = new TouchAction(driver);
    	touchAction.tap(215,600).perform();

	}

	@Override
	public void e_aplicarEndereco() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Image")));
		TouchAction touchAction = new TouchAction(driver);
    	touchAction.tap(215,600).perform();

	}

	@Override
	public void e_logar() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Image")));
		TouchAction touchAction = new TouchAction(driver);
    	touchAction.tap(122,508).perform();


	}

	@Override
	public void e_pagarComCartaoCredito() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Image")));
		TouchAction touchAction = new TouchAction(driver);
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		touchAction.press(1000,600).perform();
    	touchAction.moveTo(0,50).perform();
    	touchAction.tap(155, 300).perform();

	}

	@Override
	public void v_Home() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Image")));
		TouchAction touchAction = new TouchAction(driver);
    	touchAction.tap(105, 70).perform();
	}

	@Override
	public void e_adicionarProduto() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Image")));
		TouchAction touchAction = new TouchAction(driver);
    	touchAction.tap(700, 464).perform();

	}

	@Override
	public void v_IPO() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Image")));
		TouchAction touchAction = new TouchAction(driver);
    	touchAction.tap(1072, 365).perform();

	}

	@Override
	public void e_concluirCompra() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Image")));
		TouchAction touchAction = new TouchAction(driver);
    	touchAction.tap(1072, 365).perform();
	}

	@Override
	public void e_selecionarEndereco() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Image")));
		TouchAction touchAction = new TouchAction(driver);
    	touchAction.tap(215,600).perform();

	}

	@Override
	public void v_ExibirModalidadesEntrega() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Image")));
		TouchAction touchAction = new TouchAction(driver);
    	touchAction.tap(215,600).perform();

	}

	@Override
	public void e_realizarPagamento() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Image")));
		TouchAction touchAction = new TouchAction(driver);
    	touchAction.tap(1072, 365).perform();

	}

	@Override
	public void e_removerProduto() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Image")));
		TouchAction touchAction = new TouchAction(driver);
    	touchAction.tap(105, 70).perform();

	}

	@Override
	public void e_pesquisar_achou() {
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
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Image")));
		TouchAction touchAction = new TouchAction(driver);
    	touchAction.tap(1072, 365).perform();

	}

	@Override
	public void e_finalizarComCartao() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Image")));
		TouchAction touchAction = new TouchAction(driver);
    	touchAction.tap(1072, 365).perform();

	}

	@Override
	public void e_selecionar() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Image")));
		TouchAction touchAction = new TouchAction(driver);
    	touchAction.tap(837, 558).perform();

	}

	@Override
	public void e_voltarLogado() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Image")));
		TouchAction touchAction = new TouchAction(driver);
    	touchAction.tap(105, 70).perform();

	}

	@Override
	public void e_rejeitarPagamento() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Image")));
		TouchAction touchAction = new TouchAction(driver);
		touchAction.tap(60, 86).perform();

	}

	@Override
	public void e_voltarHome() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Image")));
		TouchAction touchAction = new TouchAction(driver);
		touchAction.tap(60, 86).perform();
	}

	@Override
	public void v_FinalizarCompra() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Image")));
		TouchAction touchAction = new TouchAction(driver);
    	touchAction.tap(1072, 365).perform();

	}

	@Override
	public void v_Carrinho() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Image")));
		TouchAction touchAction = new TouchAction(driver);
    	touchAction.tap(860, 600).perform();

	}

	@Override
	public void e_aprovarPagamento() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Image")));
		TouchAction touchAction = new TouchAction(driver);
    	touchAction.tap(1000, 510).perform();

	}

	@Override
	public void e_voltar() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Image")));
		TouchAction touchAction = new TouchAction(driver);
		touchAction.tap(60, 86).perform();
	}

	@Override
	public void e_Init() {
		System.out.println("Teste");

	}

	@Override
	public void v_ListaProdutos() {
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
	public void v_ErroTexto() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Image")));
		TouchAction touchAction = new TouchAction(driver);
    	touchAction.tap(105, 70).perform();

	}

	@Override
	public void e_pesquisar_nao_achou() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Image")));
		TouchAction touchAction = new TouchAction(driver);
    	touchAction.tap(105, 70).perform();
		
	}

	@Override
	public void e_pesquisar_texto_nao_achou() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Image")));
		TouchAction touchAction = new TouchAction(driver);
    	touchAction.tap(105, 70).perform();
		
	}

	@Override
	public void e_pesquisar_texto_achou() {
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

}
