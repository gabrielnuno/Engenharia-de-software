package com.biblioteca.model;

public class Livro {
	private String titulo;
	private int ISBN;
	private int paisLingua;
	private int editora;
	private int idISBN;
	private int anoPublicacao;
	private String estante;
	private String autor;
	private String temaCategoria;
	private double preco;
	private boolean alugado;
	private int qtdAcervo;
	private int qtdAlugada;
	private boolean reservado;
	private int qtdReservas;

	public Livro(String titulo, int paisLingua, int editora, int idISBN, int anoPublicacao, String estante,
			String autor, String temaCategoria, double preco, boolean alugado, int qtdAcervo, int qtdAlugada,
			boolean reservado, int qtdReservas) {
		super();
		this.titulo = titulo;
		
		this.paisLingua = paisLingua;
		this.editora = editora;
		this.idISBN = idISBN;
		this.anoPublicacao = anoPublicacao;
		this.estante = estante;
		this.autor = autor;
		this.temaCategoria = temaCategoria;
		this.preco = preco;
		this.alugado = alugado;
		this.qtdAcervo = qtdAcervo;
		this.qtdAlugada = qtdAlugada;
		this.reservado = reservado;
		this.qtdReservas = qtdReservas;
		ISBN = gerarISBN(paisLingua, editora, idISBN, anoPublicacao);
	}
	
	public Livro() {};

	public int gerarISBN(int paisLingua, int editora, int idISBN, int anoPublicacao) {
		int[] ISBN = new int[] { this.paisLingua, this.editora, this.idISBN, this.anoPublicacao };
		int ISBNgerado;
		String tempISBN = ""; int i;
		for(i = 0; i < ISBN.length; i++) {
			tempISBN = tempISBN + String.valueOf(ISBN[i]);
		}
		ISBNgerado = Integer.parseInt(tempISBN);
		return ISBNgerado;

	}

	public void aumentaQuantidade() {

	}

	public void exibirInfo() {

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public int getPaisLingua() {
		return paisLingua;
	}

	public void setPaisLingua(int paisLingua) {
		this.paisLingua = paisLingua;
	}

	public int getEditora() {
		return editora;
	}

	public void setEditora(int editora) {
		this.editora = editora;
	}

	public int getIdISBN() {
		return idISBN;
	}

	public void setIdISBN(int idISBN) {
		this.idISBN = idISBN;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public String getEstante() {
		return estante;
	}

	public void setEstante(String estante) {
		this.estante = estante;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTemaCategoria() {
		return temaCategoria;
	}

	public void setTemaCategoria(String temaCategoria) {
		this.temaCategoria = temaCategoria;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isAlugado() {
		return alugado;
	}

	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}

	public int getQtdAcervo() {
		return qtdAcervo;
	}

	public void setQtdAcervo(int qtdAcervo) {
		this.qtdAcervo = qtdAcervo;
	}

	public int getQtdAlugada() {
		return qtdAlugada;
	}

	public void setQtdAlugada(int qtdAlugada) {
		this.qtdAlugada = qtdAlugada;
	}

	public boolean isReservado() {
		return reservado;
	}

	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}

	public int getQtdReservas() {
		return qtdReservas;
	}

	public void setQtdReservas(int qtdReservas) {
		this.qtdReservas = qtdReservas;
	}
	
	public String toString() {
		return "Título: "+ this.titulo+" Autor: "+this.autor+" Categoria: "+this.temaCategoria;
	}

}