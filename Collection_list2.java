package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collection_list2 {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<Integer>();
		int num,x;
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		num = leia.nextInt();
		
		
		if(numeros.contains(num)) {   
			System.out.println("O número "+num+" está localizado na posição: "+numeros.indexOf(num));
		        
		    }
		 
		 
		    else {
		        System.out.println("O número "+num+" não foi encontrado!");
		    }
		}
		}


	


