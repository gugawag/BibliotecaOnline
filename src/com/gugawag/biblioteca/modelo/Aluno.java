package com.gugawag.biblioteca.modelo;

public class Aluno {
	
	private int codigo;
	private String matricula;
	private String nome;
	

	public Aluno() {
		super();
	}

	public Aluno(int codigo, String matricula, String nome) {
		super();
		this.codigo = codigo;
		this.matricula = matricula;
		this.nome = nome;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
