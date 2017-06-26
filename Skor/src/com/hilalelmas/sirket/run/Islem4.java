package com.hilalelmas.sirket.run;

import com.hilalelmas.sirket.dao.DAO;
import com.hilalelmas.sirket.entity.Adres;
import com.hilalelmas.sirket.entity.Il;
import com.hilalelmas.sirket.entity.Personel;

public class Islem4 {
	public static void main(String[] args) {
		DAO dao = new DAO();
		Il il = new Il();
		il.setName("ankara");
		dao.insert(il);

		Adres adres = new Adres();
		adres.setIl(il);
		adres.setAdresVerisi("Çankaya/Ankara");
		dao.insert(adres);

		Personel personel = new Personel();
		personel.setName("hasan");
		personel.setAdres(adres);
		dao.insert(personel);
	}

}
