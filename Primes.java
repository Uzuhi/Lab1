package nes;
import java.io.PrintStream;
//import java.util.Scanner;

public class Primes {
	public static void main(String[] args)
		throws java.io.UnsupportedEncodingException //для вывода на русском с помощью библиотеки java.io.PrintStream
	{
		PrintStream ps = new PrintStream(System.out, true, "UTF-8"); //для вывода на русском с помощью библиотеки java.io.PrintStream
		//Scanner s = new Scanner(System.in);
		//int n = s.nextInt();
		for (int i = 2; i <= 100; i++) {		//перебор чисел от 2 до 100 включительно
			if (isPrime(i) == true) {			//если isPrime посчитал число простым 
				ps.print(i + ", ");				//вывожу число в строку (print для строки, println для столбцов)
			}
			/*else {
				ps.println("Простое число");
			}*/
		}
	}
	public static boolean isPrime (int n){		//функция isPrime
		for(int i = 2; i < n; i++) {			//перебор чисел от 2 до числа из цикла в главной функции НЕ ВКЛЮЧИТЕЛЬНО
			if (n%i == 0) {						//если делится
				return false;					//значит не простое
			}
		}
		return true;							
	}
}
