package aula;

import java.util.ArrayList;


public class Aula5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList lista = new ArrayList();
		lista.size();
		lista.add("adasdasdasdasd");
		TV t= new TV();
		lista.add(new TV());
		lista.add(t);
		lista.add(new TV());
		lista.add(t);
		lista.add(2.2);
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		System.out.println();
		for (Object ob : lista) {
			if(ob.getClass().equals(TV.class))				
				if(ob instanceof TV);
					//ob. =[TV] TV.ligar();
		}
		for (Object ob : lista) {
			if(ob.getClass().equals(TV.class))
				System.out.println(ob);
		}
			System.out.println(lista.indexOf(t));
			System.out.println(lista.lastIndexOf(t));
			System.out.println(lista.contains(t));
			System.out.println(lista.remove(t));
			System.out.println(lista.size());
			System.out.println(lista.isEmpty());
			System.out.println();
		System.out.println();
	}

}
