package sorting;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.NoSuchElementException;

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
			repeatedNumber(nums, position, number);

			System.out.println("The number's position is: ");

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
	public static void repeatedNumber(ArrayList<Integer> nums,int position, int number) {
		ListIterator<Integer> it = nums.listIterator(position);

		int equalNumbers = 0;

		//If there's repeated numberes this method counts and print them
		try {

			while (it.previous() == number) {
				equalNumbers++;
			}

		}
		catch(NoSuchElementException Exception) {

		}

		try {

			it = nums.listIterator(position);
			while(it.next() == number) {
				equalNumbers++;

			}

		}
		catch(NoSuchElementException Exception) {

		}

		if(equalNumbers == 1) {
			System.out.println("There's one number " + number + " in the list\n");
			return;
		} 
		else {
			System.out.println("There are " + equalNumbers + " number " + number + "\n");
			return;
		}
	}
}