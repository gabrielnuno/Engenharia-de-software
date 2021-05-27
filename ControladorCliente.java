package com.biblioteca.controller;

import com.biblioteca.model.Livro;
import com.biblioteca.model.operacoesCliente;

public class ControladorCliente {
	public Livro controlaProcura(String titulo){
		operacoesCliente op = new operacoesCliente();
		return op.procuraLivro(titulo);
	}

}
