package com.gugawag.biblioteca.modelo;

public class Usuario {
	
	private int codigo;
	private String login;
	private String nome;
	private String senha;
	
	
	public Usuario() {
		super();
	}

	public Usuario(int codigo, String login, String nome, String senha) {
		super();
		this.codigo = codigo;
		this.login = login;
		this.nome = nome;
		this.senha = senha;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
