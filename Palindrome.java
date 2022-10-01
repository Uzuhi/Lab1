package nes;
import java.util.Scanner;
import java.io.PrintStream;
import java.util.Arrays;

public class Palindrome {
	public static void main(String[] args)
		throws java.io.UnsupportedEncodingException							//для вывода на русском с помощью библиотеки java.io.PrintStream
	{
		PrintStream ps = new PrintStream(System.out, true, "UTF-8"); 		//для вывода на русском с помощью библиотеки java.io.PrintStream
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();											//ввод строки
		String[] str = a.split(" ");										//перевод строки в строковый массив из слов
		reverseString(str);													//вызов функции reverseString
	}
	public static void reverseString (String[] a)
		throws java.io.UnsupportedEncodingException
	{
		PrintStream ps = new PrintStream(System.out, true, "UTF-8");
		char[] str = {};													//создание символьных массивов (char)
		char[] str2 = {};
		for (int i = 0; i < a.length; i++) {								//перебор слов
			str = a[i].toCharArray();										//ввод слова в массивы
			str2 = a[i].toCharArray();
			int n = str.length-1;											//создание переменной для заполнения второго массива
			for (int j = 0; j < str.length; j++) {							//заполнение второго массива
				str2[j] = str[n];
				n--;
			}
			if (isPalindrome(str,str2) == true)								//является ли слово палиндромом
				ps.println(a[i] + " - палиндром");
			else
				ps.println(a[i] + " - не палиндром");
		}
	}
	public static boolean isPalindrome(char[] s1, char[] s2)
			throws java.io.UnsupportedEncodingException
	{
		for (int i = 0; i < s1.length; i++) {								//проверка: одинаковые ли буквы в слове
			if (s1[i] != s2[i])
				return false;
		}
		return true;
	}
}
