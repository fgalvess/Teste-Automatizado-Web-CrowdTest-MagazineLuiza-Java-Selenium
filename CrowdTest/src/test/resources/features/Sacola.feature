#language: pt
#enconding: UTF-8

Funcionalidade: Visualizacao e edicao do carrinho de compras

	@pesquisa
	Cenario: Pesquisar Produto
		Dado que o usuario pesquise um produto
		Entao um produto relacionado a pesquisa devera aparecer na tela
		
	@adicionarProduto	
	Cenario: Adicionar produto no carrinho
		Dado que o usuario selecionou um produto
		Quando o usuario clicar em adicionar a sacola
		Entao o produto devera aparecer na tela da sacola

	@alterarItem
	Cenario: Alterar quantidade de itens no carrinho
		Dado que o usuario esteja na tela da sacola
		E o usuario alterar a quantidade de itens para tres
		Entao sistema exibe a sacola com um subtotal de tres itens	

	@excluirProduto
	Cenario: Remover produto do carrinho
		Dado que o usuario quer remover o produto do carrinho
		Quando o usuario clicar em excluir 
		Entao o sistema exibe a sacola vazia
