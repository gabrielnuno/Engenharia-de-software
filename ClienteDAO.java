package com.biblioteca.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class ClienteDAO {

	public int qtdInventario(String login, String senha) {

		int qtd = 0;
		try {
			Connection connection = Conexao.getInstance().getConnection();

			String sql = "SELECT COUNT(*) FROM livrosCliente;";

			PreparedStatement statement = connection.prepareStatement(sql);

			ResultSet rs = statement.executeQuery("SELECT COUNT(*) FROM livrosCliente;");

			while (rs.next()) {
				qtd = rs.getInt("count");
			}

			connection.close();
			return qtd;

		} catch (Exception e) {
			e.printStackTrace();

		}
		return qtd;

	}

	public void transfereLivros(int indiceInserido, int ISBN, String login) {
		
		try {
			Connection connection = Conexao.getInstance().getConnection();

			String sql = "UPDATE livrosCliente\r\n"
					+ "SET livroISBN"+indiceInserido+" = "+ISBN+"\r\n"
					+ "WHERE login = "+login+";";

			PreparedStatement statement = connection.prepareStatement(sql);			

			statement.execute();
			connection.close();
			System.out.println("Livros transferidos com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	//public Livro procuraLivro(int ISBN) {
		
	//}

}
