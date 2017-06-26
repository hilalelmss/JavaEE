package com.hilalelmas.sirket.dao;

import com.hilalelmas.sirket.entity.Adres;
import com.hilalelmas.sirket.entity.Personel;

public class DAO extends ADao {
	public void insert(Object object) {
		em.getTransaction().begin();
		em.persist(object);
		em.getTransaction().commit();
	}

	public Adres getAdresId(int id) {
		return em.find(Adres.class, id);
	}

	public Personel getPersonelId(int id) {
		return em.find(Personel.class, id);
	}

}
