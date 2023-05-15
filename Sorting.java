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
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 10000 ; i++) {
			nums.add(rand.nextInt(0, 10000));
		}
		
		nums = sortArray(nums);
		
		System.out.println(nums);
		
		System.out.println("Escreva o número a ser procurado");
		
		DoubleIndex.segregate(nums, scan.nextInt());
		
		scan.close();
		
	}
	
	public static ArrayList<Integer> sortArray(ArrayList<Integer> nums) {
		
		Collections.sort(nums, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
			
		});
		
		return nums;
	}
}
