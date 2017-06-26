package com.hilalelmas.sirket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Adres {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@Column(name = "adres_verisi")
	String adresVerisi;
	
	@ManyToOne
	Il il;

	public void setAdresVerisi(String adresVerisi) {
		this.adresVerisi = adresVerisi;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdresVerisi() {
		return adresVerisi;
	}

	public int getId() {
		return id;
	}

	public Il getIl() {
		return il;
	}

	public void setIl(Il il) {
		this.il = il;
	}
}
