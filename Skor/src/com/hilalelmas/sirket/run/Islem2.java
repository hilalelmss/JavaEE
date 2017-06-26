package com.hilalelmas.sirket.run;

import com.hilalelmas.sirket.dao.DAO;
import com.hilalelmas.sirket.entity.Adres;
import com.hilalelmas.sirket.entity.Personel;

public class Islem2 {
	public static void main(String[] args) {
		DAO dao = new DAO();
		Adres adres = new Adres();
		adres.setAdresVerisi("Çankaya/Ankara");
		dao.insert(adres);

		Personel personel = new Personel();
		personel.setName("hasan");
		personel.setAdres(adres);
		dao.insert(personel);
	}

}
