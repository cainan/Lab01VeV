package br.com.unicamp.inf321.models.bookstore;

import org.graphwalker.core.machine.ExecutionContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.unicamp.inf321.ModeloCompleto;
import io.appium.java_client.android.AndroidDriver;

public class BookstoreModel extends ExecutionContext implements ModeloCompleto{

	private AndroidDriver<WebElement> driver;
	private WebDriverWait wait;
	
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
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void v_PagamentoCartaoCredito() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void e_finalizarComCartao() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void e_selecionar() {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void e_Init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void v_ListaProdutos() {
		// TODO Auto-generated method stub
		
	}

}
