package teatrApp.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import teatrApp.main.entities.Kontakt;

public class Main {
	public static void main(String args[]) {
		System.out.println("Start");
		Kontakt kontakt = new Kontakt();
		Kontakt kontakt2 = new Kontakt();
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		System.out.println("tran1");
		kontakt.setEmail("1EMAIL");
		kontakt.setTelefon("654321");
		session.save(kontakt);
		session.getTransaction().commit();
		session.close();
		System.out.println("end1");
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("psqlManager");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		kontakt2.setEmail("2EMAIL");
		kontakt2.setTelefon("123456");
		entityManager.getTransaction().begin();
		System.out.println("tran2");
		entityManager.persist(kontakt2);
		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();
		System.out.println("end");
	}

}
