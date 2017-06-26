package com.hilalelmas.sirket.run;

import java.util.Spliterator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hilalelmas.sirket.entity.Personel;
import com.hilalelmas.sirket.entity.Skor;

public class Islem {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Skor");
		EntityManager entityManager = emf.createEntityManager();

		Skor skor = new Skor();
		// skor.setId(1);
		skor.setName("hilal");
		entityManager.getTransaction().begin();
		entityManager.persist(skor);
		entityManager.getTransaction().commit();

		Personel personel = new Personel();
		// personel.setPersonelId(10);
		personel.setName("hasan");
		entityManager.getTransaction().begin();
		entityManager.persist(personel);
		entityManager.getTransaction().commit();

		Skor skor2 = new Skor();
		// skor2.setId(2);
		skor2.setName("mustafa");
		entityManager.getTransaction().begin();
		entityManager.persist(skor2);
		entityManager.getTransaction().commit();

		Skor skor3 = entityManager.find(Skor.class, 3);
		System.out.println(skor3.getName());
	}

}
