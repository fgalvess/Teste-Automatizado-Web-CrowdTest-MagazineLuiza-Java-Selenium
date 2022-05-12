package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProdutoPage {

	@FindBy(xpath = "//button[@class='button__buy button__buy-product-detail js-add-cart-button js-main-add-cart-button js-add-box-prime']")
	private WebElement botaoSacola;
	
	public void adicionarNaSacola() {
		botaoSacola.click();
	}
}
