package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.ProdutoPage;
import pageObjects.SacolaPage;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class SacolaSteps {

	@Dado("que o usuario pesquise um produto")
	public void queOUsuarioPesquiseUmProduto() {
	   Na(TelaInicialPage.class).pesquisarPruduto(); 
	}

	@Entao("um produto relacionado a pesquisa devera aparecer na tela")
	public void umProdutoRelacionadoAPesquisaDeveraAparecerNaTela() {
	    assertEquals("Kit 5 Camisa Gola Polo Masculina Piquet de Algodão", driver.findElement(By.xpath("//h2[text()[contains(.,\"Kit 5 Camisa Gola Polo\")]]")).getText());
	    Na(TelaInicialPage.class).selecionarProduto();
	}
	
	@Dado("que o usuario selecionou um produto")
	public void queOUsuarioSelecionouUmProduto() {
	   Na(TelaInicialPage.class).produtoSelecionado();
	}

	@Quando("o usuario clicar em adicionar a sacola")
	public void oUsuarioClicarEmAdicionarASacola() {
	    Na(ProdutoPage.class).adicionarNaSacola();
	}

	@Entao("o produto devera aparecer na tela da sacola")
	public void oProdutoDeveraAparecerNaTelaDaSacola() {
		assertEquals(true, driver.findElement(By.xpath("//p[text()='Kit 5 Camisa Gola Polo Masculina Piquet de Algodão - imp  - G']")).isDisplayed());
	}
	
	@Dado("que o usuario esteja na tela da sacola")
	public void queOUsuarioEstejaNaTelaDaSacola() {
		Na(TelaInicialPage.class).produtoSelecionado();
		Na(ProdutoPage.class).adicionarNaSacola();
	}

	@Dado("o usuario alterar a quantidade de itens para tres")
	public void oUsuarioAlterarAQuantidadeDeItensParaTres() {
	    Na(SacolaPage.class).alterarQuantidadeDeItens();
	}

	@Entao("sistema exibe a sacola com um subtotal de tres itens")
	public void sistemaExibeASacolaComUmSubtotalDeTresItens() {
	   assertEquals(true, driver.findElement(By.xpath("//select[@class]/option[@value='3']")).isDisplayed());
	}
	
	@Dado("que o usuario quer remover o produto do carrinho")
	public void queOUsuarioQuerRemoverOProdutoDoCarrinho() {
		Na(TelaInicialPage.class).produtoSelecionado();
		Na(ProdutoPage.class).adicionarNaSacola();
	}

	@Quando("o usuario clicar em excluir")
	public void oUsuarioClicarEmExcluir() {
	    Na(SacolaPage.class).excluirProduto();
	}

	@Entao("o sistema exibe a sacola vazia")
	public void oSistemaExibeASacolaVazia() {
	   assertEquals("Sua sacola está vazia", driver.findElement(By.xpath("//div[text()='Sua sacola está vazia']")).getText());
	}

}
