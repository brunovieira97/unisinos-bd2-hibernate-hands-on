package model;

import javax.persistence.*;

public class FruteiraTeste {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bd2_persistence_unit");
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			
			Fruteira fruteira = new Fruteira("do Zé");
			Classificacao classificacao = new Classificacao("Classificação");
			
			em.persist(fruteira);
			em.persist(classificacao);
			
			Fruta fruta = new Fruta(fruteira, classificacao, "Maçã", 10.0);
			
			em.persist(fruta);
			
			em.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}

	}

}
