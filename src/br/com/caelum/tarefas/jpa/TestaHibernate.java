package br.com.caelum.tarefas.jpa;

//import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//import javax.persistence.Query;

import br.com.caelum.tarefas.modelo.Tarefa;

public class TestaHibernate {
	
	public static void main(String[] args) {
		System.out.println("Executando Testa Hibernate");
		
		// NamedQuery | JPQL | NativeQuery
		
		criandoNovaTarefa();
		
		//buscandoUmaTarefa();
		
		//excluindoTarefaPorId();
		
		//obtemTarefasFinalizadas();
		
	}

/*	private static void obtemTarefasFinalizadas() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		Query query = manager.createQuery("select t from Tarefa as t where t.finalizado = :paramFinalizado");
		query.setParameter("paramFinalizado", true);
		
		List<Tarefa> tarefas = query.getResultList();
		
		for (Tarefa tarefa : tarefas) {
			System.out.println("Tarefa: " + tarefa.getDescricao());
		}
		
		manager.close();
		factory.close();
	}

	private static void excluindoTarefaPorId() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		Tarefa tarefa = manager.find(Tarefa.class, 1L);
		
		System.out.println("Tarefa carregada: " + tarefa.getDescricao());
		
		manager.getTransaction().begin();
		manager.remove(tarefa);
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}

	private static void buscandoUmaTarefa() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		Tarefa tarefa = manager.find(Tarefa.class, 3L);
		
		System.out.println("Tarefa carregada: " + tarefa.getDescricao());
		
		manager.close();
		factory.close();
	}*/

	private static void criandoNovaTarefa() {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		Tarefa tarefa = new Tarefa();
		tarefa.setDescricao("Estudar JPA");
		tarefa.setFinalizado(true);
		
		manager.getTransaction().begin();
		manager.persist(tarefa);
		manager.getTransaction().commit();		
		
		manager.close();
		factory.close();
	}
	


}
