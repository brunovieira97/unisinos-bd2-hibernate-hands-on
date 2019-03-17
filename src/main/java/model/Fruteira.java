package model;

import javax.persistence.*;

@Entity
public class Fruteira {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_fruteira")
	@SequenceGenerator(name = "seq_fruteira", sequenceName = "s_fruteira", allocationSize = 1)
	private int idFruteira;
	private String nome;
	
	public Fruteira() {}
	
	public Fruteira(String nome) {
		super();
		this.nome = nome;
	}
	
	public int getIdFruteira() {
		return idFruteira;
	}
	
	public void setIdFruteira(int idFruteira) {
		this.idFruteira = idFruteira;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
