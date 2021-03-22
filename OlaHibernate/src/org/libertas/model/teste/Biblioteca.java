package org.libertas.model.teste;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Biblioteca {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idbliblioteca;
	private String nome;
	private String endereco;

	@OneToMany
	@JoinColumn(name = "idbiblioteca_fk")
	private List<Livro> livros;

	public int getIdbliblioteca() {
		return idbliblioteca;
	}

	public void setIdbliblioteca(int idbliblioteca) {
		this.idbliblioteca = idbliblioteca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

}
