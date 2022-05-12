package pageObjects;

import static utils.Utils.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SacolaPage {

	@FindBy(xpath = "//select[@class]")
	private WebElement quantidade;
	
	@FindBy(xpath = "//select[@class]/option[@value='3']")
	private WebElement alterarQuantidade;
	
	@FindBy(xpath = "//span[text()='Excluir']")
	private WebElement exlcuir;
	
	public void alterarQuantidadeDeItens() {
		quantidade.click();
		alterarQuantidade.click();
		sleep();
	}
	
	public void excluirProduto() {
		exlcuir.click();
		sleep();
	}
}
