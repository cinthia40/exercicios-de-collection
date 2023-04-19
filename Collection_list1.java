package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Collection_list1 {

	public static void main(String[] args) {
		String cor;
		int i;
     List<String> cores = new ArrayList<String>();
		
     	Scanner leia = new Scanner (System.in);
     
     
     for (i=1;i<=5;i++) {
		System.out.println("Digite uma cor: ");
		cor = leia.nextLine();
		cores.add(cor);
		
     	}
     
     for(i=0;i<cores.size();i++) {
			System.out.println("\nCor: "+cores.get(i));
		}
     
     	Collections.sort(cores);
		System.out.println("\nOrdenado: ");
		System.out.println(cores);
		System.out.println();
     
		
	}

}
