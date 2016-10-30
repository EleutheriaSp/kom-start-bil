package pl.komstart.uslugi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pl.kompro.uslugi.Utrwalacz;

public class UtrwalaczBil extends Utrwalacz{
	private final EntityManagerFactory emf;
	private EntityManager em;
	
	/*
	 * test bez calej aplikacji
	 */
	public static void main( String[] args){
		Utrwalacz.manager();
	}

	public UtrwalaczBil(){
		emf= Persistence.createEntityManagerFactory( "kom-start-bil");
	}
	
	@Override protected EntityManager getManager(){
		if( em== null || !em.isOpen())
			em= emf.createEntityManager();
		return em;
	}

}
