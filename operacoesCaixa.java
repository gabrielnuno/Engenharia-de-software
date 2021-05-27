package com.biblioteca.model;

public class operacoesCaixa {

	public void transfereIn(Cliente c) {
		ClienteDAO cDAO = new ClienteDAO();
		int indice = 0; 
		int indiceInserido = c.getInventario().size() + cDAO.qtdInventario(c.getLogin(), c.getSenha()) - c.getInventario().size();
		if (c.getInventario().size() + cDAO.qtdInventario(c.getLogin(), c.getSenha()) <= 6) {
			for (Livro l : c.getInventario()) {
				cDAO.transfereLivros(indiceInserido, l.getISBN(), c.getLogin());

			}
		}
	}

}
