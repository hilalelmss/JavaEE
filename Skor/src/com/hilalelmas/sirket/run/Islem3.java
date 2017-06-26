package com.hilalelmas.sirket.run;

import com.hilalelmas.sirket.dao.DAO;
import com.hilalelmas.sirket.entity.Personel;

public class Islem3 {
	public static void main(String[] args) {

		DAO dao = new DAO();
		Personel per = dao.getPersonelId(2);
		System.out.println(per.getAdres().getAdresVerisi());
	}
}
