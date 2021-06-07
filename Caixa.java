package com.biblioteca.model;




public class Caixa extends Usuario {

	public Caixa(String login, String senha, String nome, String telefone) {
		super(login, senha, nome, telefone);
		
	}
	
	public Livro procurarLivro(Livro livro) {
		livro = livro.getTitulo();
		return livro;
	}
	
	public void transferirOut() {
		
	}
	
	public void transferirIn() {
		
	}
	
	public void gerarMulta() {
		
	}

}
