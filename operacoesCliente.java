package com.biblioteca.model;

public class operacoesCliente {
	public Livro procuraLivro(String titulo) {
		LivroDAO lDAO = new LivroDAO();
		return lDAO.procuraLivro(titulo);
	}

}
