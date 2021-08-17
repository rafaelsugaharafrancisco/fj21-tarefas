package br.com.caelum.tarefas.teste;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Testando o método main....");
		
		EntityManagerFactory factory = Persistence.
				createEntityManagerFactory("tarefas");
				factory.close();
	}

}
