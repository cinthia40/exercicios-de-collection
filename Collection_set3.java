package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;

public class Collection_set3 {

	public static void main(String[] args) {
		int i = 0;
		Set<Integer> numeros = new HashSet<Integer>();
		
		Scanner leia = new Scanner (System.in);
		
		Iterator<Integer> listaNumeros = numeros.iterator();
		
		
        for (i=0;i<10;i++) {
            System.out.println("Digite o valor: ");
            numeros.add(leia.nextInt());
            
        }

        System.out.println("Lista dados do Set: ");
        
            listaNumeros.hasNext();
            System.out.println(numeros);
            
    

    }
}
