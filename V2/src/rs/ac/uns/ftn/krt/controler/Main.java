package rs.ac.uns.ftn.krt.controler;

import rs.ac.uns.ftn.krt.model.Ispisivo;
import rs.ac.uns.ftn.krt.model.Torba;

import rs.ac.uns.ftn.krt.model.Zena;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zena z1 = new Zena();
		z1.setIme("Z1");
		
		Torba t1 = new Torba();
		System.out.println("USPEO DA DODA -> " + t1.dodaj("RUZ"));
		System.out.println("USPEO DA DODA -> " + t1.dodaj("RUZ"));
		
		z1.setTorba(t1);
		System.out.println("ispravan -> " + z1.getPolniOrgan().isIspravan());
		z1.ispisiSe();
		dajNestoIspisivo(z1);
		dajNestoIspisivo(new Ispisivo(){

			@Override
			public void ispisiSe() {
				System.out.println("Hola ebola");				
			}			
		});

	}
	public static void dajNestoIspisivo(Ispisivo s1){
		s1.ispisiSe();
	}

}
