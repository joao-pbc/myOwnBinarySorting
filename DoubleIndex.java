package sorting;

import java.util.ArrayList;

public class DoubleIndex {

	public static int segregate(ArrayList<Integer> nums, int num) {

		return segregate(nums, num, nums.size(), 0);
	}

	
	// método depois da primeira tentativa
	public static int segregate(ArrayList<Integer> nums, int num, int fim, int inicio) {


		ArrayList<Integer> array = nums;

		Integer number = num;

		int end = fim, start = inicio;
		int position = (start + end)/2;
		
		//Condição de não achar o numero
		if(start > end) {
			return -1;
		}
		
		if(array.get(position) == number) {
			// se for o numero certo
			return position;

		}

		// Procura na metado menor
		if( array.get(position) > number) {

			return segregate(nums, number, position - 1, start);
		} 
		// se o numero da posicao atual for menor que o numero
		else {

			return segregate(nums, number, end, position + 1);
		}
		// recursividade
	}
}