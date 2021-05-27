package com.biblioteca.controller;

import com.biblioteca.model.Caixa;
import com.biblioteca.model.Cliente;
import com.biblioteca.model.Usuario;
import com.biblioteca.model.operacoesCaixa;

public class ControladorCaixa {

	public void controlaTransferenciaIn(Usuario u1, Usuario u2) {
		if (u1 instanceof Cliente && u2 instanceof Caixa) {
			operacoesCaixa opCX = new operacoesCaixa();
			opCX.transfereIn((Cliente) u1);

		}

	}
}
