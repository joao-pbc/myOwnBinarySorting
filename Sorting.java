package sorting;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		
		Random rand = new Random();
		
		int resultadoBusca = 0;
		
		Scanner scan = new Scanner(System.in);
		
		// populando lista
		for (int i = 0; i < 100 ; i++) {
			nums.add(rand.nextInt(0, 100));
		}
		
		// ordenando lista de forma crescente
		nums = sortArray(nums);
		
		// mostra lista
		System.out.println(nums);
		
		System.out.println("Escreva o número a ser procurado");
		
		// resultado da busca
		resultadoBusca = DoubleIndex.segregate(nums, scan.nextInt()) + 1;
		
		// resultado se não encontrar
		if(resultadoBusca == 0) {
			
			System.out.println("Numero não pertence à lista de numeros");
		} else{
			
			System.out.println(resultadoBusca);
		}
		
		scan.close();
		
	}
	
	public static ArrayList<Integer> sortArray(ArrayList<Integer> nums) {
		
		// metodo para organizar lista de forma crescente
		Collections.sort(nums, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
			
		});
		
		return nums;
	}
}