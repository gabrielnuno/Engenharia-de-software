package com.biblioteca.model;

public class operacoesAdministracao {
	// private static LivroDAO operacoes;

	public void inserirLivro(Livro l) {
		LivroDAO operacoes = new LivroDAO();
		if (!operacoes.validarLivro(l.getIdISBN())) {
			System.out.println("inserido antes op");
			operacoes.inserirLivro(l);
		}

	}

	public void deletarLivro(Livro l) {
		LivroDAO operacoes = new LivroDAO();
		if (operacoes.validarLivro(l.getIdISBN())) {
			operacoes.removerLivro(l);

		}
	}

}
