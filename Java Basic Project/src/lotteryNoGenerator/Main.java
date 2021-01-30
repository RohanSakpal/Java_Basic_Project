package lotteryNoGenerator;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/*	we generate 6 no. out of 49 no. 
 * 	we have to check that drawn number is not repeating all the previously drawn no.
 * 	we sort the result finaly.
 */
public class Main {

	public static void main(String[] args) {
		Random rnd = new Random();
		int min=1, max=49, slots=6;
		
		int[] lotteryArr = new int[slots];
		boolean isRepeated;
		int randomNo = 0;
		
		for(int index=0; index<slots; index++) {
			do {
				isRepeated = false;
				randomNo = rnd.nextInt(max)+min;
				
				for(int k=0; k<index; k++) {
					if(lotteryArr[k] == randomNo) {
						isRepeated = true;
						break;
					}
				}
			} while(isRepeated);
			lotteryArr[index] = randomNo;
		}
		
		Arrays.sort(lotteryArr);
		System.out.println("result of lottery : ");
		for(int i=0; i<slots; i++) {
			System.out.print(lotteryArr[i]+" ");
		}
	}
}
