package rs.ac.uns.ftn.rtrk.controller;
import java.util.ArrayList;
import java.util.List;

import rs.ac.uns.ftn.rtrk.model.Ispisivo;
import rs.ac.uns.ftn.rtrk.model.PolniOrgan;

public class Main implements Ispisivo{
	
	public static void f1(PolniOrgan p1) {
		System.out.println(p1.getDuzina());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolniOrgan p1 = new PolniOrgan();
		PolniOrgan p2 = new PolniOrgan();

		System.out.println("p1 == p2"+ (p1 == p2));
		System.out.println("p1 == p2"+ (p1 == p1));
		System.out.println("p1.equals(p2)"+ p1.equals(p2));
		
		List<PolniOrgan> polniOrgan = new ArrayList<>();
		
		polniOrgan.add(p1);
		polniOrgan.add(p2);
		
		System.out.println("Contains p1 "+polniOrgan.contains(p1));
		
		
		Ispisivo i = new Ispisivo() {
			
			@Override
			public void ispisiSe() {
				// TODO Auto-generated method stub
				System.out.println("Ispisao se");
				
			}
		};

	}

	@Override
	public void ispisiSe() {
		// TODO Auto-generated method stub
		System.out.println("Ispisao se iz ovog");
	}

}

