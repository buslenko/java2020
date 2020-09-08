package com.company;

import java.util.*;

public class Main {

	static int factorial(int x){      //нахождение факториала
		int result = 1;
		for (int i=1; i<=x; i++){
			result = result*i;
			System.out.println(result);
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(factorial(6));
		double[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;
		int i = 0;
	/*for( i=0; i< array.length; i++){    //цикл for
	    sum = sum + array[i];
	}
	System.out.println(sum);*/

		/*while(i < array.length){           //цикл while
			sum = sum + array[i];
			i++;
		}
		System.out.println(sum);*/


		/*do{                              //цикл  do while
			sum = sum + array[i];
			i++;
		}
		while (i < array.length);
		System.out.println(sum);*/

		/*for( i=0; i< array.length; i++){    // вывод массива
			System.out.println(array[i]);
		}*/


		/*for(i=0; i< array.length; i++){    //гармонический ряд
			array[i]= 1/array[i];
			String result = String.format("%.2f", array[i]);
			System.out.println(result);
		}*/


		/*int[] mass;
		mass = new int [5];
		int c=0, a=0, b=100;
		for (i=0; i< mass.length; i++){
			mass[i] = a + (int) (Math.random() * b);
			//Random random = new Random();
			//mass[i] = random.nextInt();
			System.out.println(mass[i] + " ");
		}
		Arrays.sort(mass);
		for (i=0; i< mass.length; i++){
			System.out.println(mass[i] + " ");
		}*/
	}

}







