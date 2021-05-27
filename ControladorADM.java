package com.biblioteca.controller;

import com.biblioteca.model.Administrador;
import com.biblioteca.model.Livro;
import com.biblioteca.model.Usuario;
import com.biblioteca.model.operacoesAdministracao;



public class ControladorADM {
	
	public void controlaInsercao(Livro l, Usuario u) {
		if(u instanceof Administrador) {
			operacoesAdministracao op = new operacoesAdministracao();
			System.out.println("Inserido antes");
			op.inserirLivro(l);
			System.out.println("Inserido");
		}
	}
	
	public void controlaDelecao(Livro l, Usuario u) {
		if(u instanceof Administrador) {
			operacoesAdministracao op = new operacoesAdministracao();
			op.deletarLivro(l);
		}
	}

}
