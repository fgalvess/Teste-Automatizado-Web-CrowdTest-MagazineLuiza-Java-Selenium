package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static utils.Utils.*;

public class TelaInicialPage {
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement campoPesquisa;
	
	@FindBy(xpath = "//*[@data-testid=\"search-submit\"]")
	private WebElement botaoPesquisar;
	
	@FindBy(xpath = "//button[text()[contains(.,\"ENTENDI E FECHAR\")]]")
	private WebElement fecharCookies;
	
	@FindBy(xpath = "//h2[text()[contains(.,\"Kit 5 Camisa Gola Polo\")]]")
	private WebElement camisaPolo;
	
	
	public void pesquisarPruduto() {
		campoPesquisa.sendKeys("camisa polo");
		botaoPesquisar.click();
		sleep();
		fecharCookies.click();
	}
	
	public void selecionarProduto() {
		camisaPolo.click();
	}

	public void produtoSelecionado() {
		campoPesquisa.sendKeys("camisa polo");
		botaoPesquisar.click();
		sleep();
		fecharCookies.click();
		camisaPolo.click();
	}

}
