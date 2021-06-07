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
       public int ProcuraC(Cliente c) {

        for (int i = 0; i < c.length(); i++) {
            if (c.equals(i)) {  
                return 1;
            } else {
                return 0;
            }
        }
        return 0;
    }

    public double VerMulta(Cliente c) {

        double multa;
        ProcuraC(Cliente c);

        if (ProcurarC == 1) {
           multa= Multa.getMulta();
            if (multa != 0) {
                return multa;
            } else {
                return 0;
            }
        }
         return 0;
    }

    public void ImprMul(Cliente c) {

        VerMulta(Cliente c);
        if (VerMulta.getMulta != 0 || VerMulta.getMulta!= null) {
            System.out.println("A multa do cliente é" + VerMulta.getMulta );
        } else if (VerMulta == 0) {
            System.out.println("não há multa");
        } else {
            System.out.println("Cliente não encontrado");
        }
    }
}
