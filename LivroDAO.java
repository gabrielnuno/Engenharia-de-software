package com.biblioteca.model;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.biblioteca.model.Conexao;

public class LivroDAO {

	public void inserirLivro(Livro l) {
		try {
			Connection connection = Conexao.getInstance().getConnection();

			String sql = "INSERT INTO livro(TITULO, ISBN, PAISLINGUA, EDITORA,\r\n"
					+ "IDISBN, ANOPUBLICACAO, ESTANTE, AUTOR, TEMACATEGORIA, PRECO, QTDACERVO,\r\n"
					+ "QTDALUGADA, QTDRESERVAS, ALUGADO) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setString(1, l.getTitulo());
			statement.setInt(2, l.getISBN());
			statement.setInt(3, l.getPaisLingua());
			statement.setInt(4, l.getEditora());
			statement.setInt(5, l.getIdISBN());
			statement.setInt(6, l.getAnoPublicacao());
			statement.setString(7, l.getEstante());
			statement.setString(8, l.getAutor());
			statement.setString(9, l.getTemaCategoria());
			statement.setDouble(10, l.getPreco());
			statement.setInt(11, l.getQtdAcervo());
			statement.setInt(12, l.getQtdAlugada());
			statement.setInt(13, l.getQtdReservas());
			statement.setInt(14, 0);

			statement.execute();

			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void removerLivro(Livro l) {
		try {
			Connection connection = Conexao.getInstance().getConnection();
			String sql = "DELETE FROM livro WHERE ISBN = ?";

			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setInt(1, l.getISBN());

			statement.execute();
			connection.close();
			System.out.println("Livro removido com sucesso");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean validarLivro(int idISBN) {

		boolean pertence = false;
		List<Integer> listaidISBN = new ArrayList<Integer>();
		try {
			Connection connection = Conexao.getInstance().getConnection();

			String sql = "SELECT * FROM LIVRO";

			PreparedStatement statement = connection.prepareStatement(sql);

			ResultSet resultset = statement.executeQuery();

			while (resultset.next()) {

				int idISBNprocura = (resultset.getInt("IDPASSAGEIRO"));
				listaidISBN.add(idISBNprocura);

			}
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();

		}
		for (Integer inteiro : listaidISBN) {
			if (inteiro == idISBN) {
				pertence = true;
				return pertence;
			}
		}
		return pertence;

	}

	public Livro procuraLivro(String titulo) {
		Livro l = new Livro();
		try {

			Connection connection = Conexao.getInstance().getConnection();

			String sql = "SELECT * FROM livro WHERE titulo = '" + titulo + "'";

			PreparedStatement statement = connection.prepareStatement(sql);

			ResultSet resultset = statement.executeQuery();

			while (resultset.next()) {
				l.setTitulo(resultset.getString(2));
				l.setPaisLingua(resultset.getInt(4));
				l.setEditora(resultset.getInt(5));
				l.setIdISBN(resultset.getInt(6));
				l.setAnoPublicacao(resultset.getInt(7));
				l.setEstante(resultset.getString(8));
				l.setAutor(resultset.getString(9));
				l.setTemaCategoria(resultset.getString(10));
				l.setPreco(resultset.getDouble(11));
				l.setQtdAcervo(resultset.getInt(12));
				l.setQtdAlugada(resultset.getInt(13));
				l.setQtdReservas(resultset.getInt(14));
				if (resultset.getInt(15) == 0) {
					l.setAlugado(false);
				} else {
					l.setAlugado(true);

				}
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return l;
	}

}
