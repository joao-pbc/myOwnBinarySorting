package sorting;

import java.util.ArrayList;
import java.util.Iterator;

public class DoubleIndex {
	
	public static int segregate(ArrayList<Integer> nums, int num) {
		
		ArrayList<Integer> array = nums;
		
		Integer number = num;
		
		int position = 0;
		
		Iterator<Integer> it = array.listIterator();
		
		//array se for par
		if(array.size() % 2 == 0) {
			
			// divide o array
			position = array.size()/2;

			//move o iterator ate position
			for (int i = 0; i < position -1; i++) {
				it.next();
			}

			if(array.get(position) == number) {
				
				// se for o numero certo
				return position;

			} else {

				// se o numero da posicao atual for maior que o numero
				if( array.get(position) > number) {
					// metade menor
					position = position/2;
				} 
				// se o numero da posicao atual for menor que o numero
				else if( array.get(position) < number ) {
					// metade maior
					position += position/2;
				}

				segregate(nums, number, position);
				
			}
			
		} else {
			
		}
		
		return 0;
	}
	
	public static int segregate(ArrayList<Integer> nums, int num, int position) {
		
		ArrayList<Integer> array = nums;
		Integer number = num;
		
		if(array.size() % 2 == 0) {
			
			
			
		} else {
			
		}
		
		
		return 0;
	}
}
