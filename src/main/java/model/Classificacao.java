package model;

import javax.persistence.*;

@Entity
public class Classificacao {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_classificacao")
	@SequenceGenerator(name = "seq_classificacao", sequenceName = "s_classificacao", allocationSize = 1)
	private int idClassificacao;
	private String nome;
	
	public Classificacao() {}
	
	public Classificacao(String nome) {
		super();
		this.nome = nome;
	}
	
	public int getIdClassificacao() {
		return idClassificacao;
	}
	public void setIdClassificacao(int idClassificacao) {
		this.idClassificacao = idClassificacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
