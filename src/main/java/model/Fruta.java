package model;

import javax.persistence.*;

@Entity
public class Fruta {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_fruta")
	@SequenceGenerator(name = "seq_futa", sequenceName = "s_fruta", allocationSize = 1)
	private int idFruta;
	@ManyToOne(optional = false)
	@JoinColumn(name = "fruteira", foreignKey = @ForeignKey(name = "fk_fruta_fruteira"))
	private Fruteira idFruteira;
	@ManyToOne(optional = false)
	@JoinColumn(name = "classificacao", foreignKey = @ForeignKey(name = "fk_fruta_classificacao"))
	private Classificacao idClassificacao;
	private String nome;
	private double preco;
	
	
	public Fruta(Fruteira idFruteira, Classificacao idClassificacao, String nome, double preco) {
		super();
		this.idFruteira = idFruteira;
		this.idClassificacao = idClassificacao;
		this.nome = nome;
		this.preco = preco;
	}
	public int getIdFruta() {
		return idFruta;
	}
	public void setIdFruta(int idFruta) {
		this.idFruta = idFruta;
	}
	public Fruteira getIdFruteira() {
		return idFruteira;
	}
	public void setIdFruteira(Fruteira idFruteira) {
		this.idFruteira = idFruteira;
	}
	public Classificacao getIdClassificacao() {
		return idClassificacao;
	}
	public void setIdClassificacao(Classificacao idClassificacao) {
		this.idClassificacao = idClassificacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
}
