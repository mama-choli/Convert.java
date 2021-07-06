package com.company;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static String[] strings = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
	public static String[] ints = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};





	private static String basic(int in) {
		String[] a = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		return a[in];
	}

	public static boolean useList(String[] arr, String targetValue) {
		return Arrays.asList(arr).contains(targetValue);
	}

	public static void off() {
		System.out.println("OFF");
	}

	public static void main(String[] args) {
		System.out.println("введите арифметичесое действие с двумя числами арабскими или римскими с 1 по 10");
		Scanner r = new Scanner(System.in);
		String v = r.nextLine();
//делаем из строки r массив строк y используя пробел как флаг
		String[] y = v.split(" ");
//если массив строк равен 3 продолжаем
		if (y.length == 3) {
			String p = y[0];
			String z = y[1];
			String h = y[2];
			String[] l = strings;
			String[] q = ints;
//сравниваем первую и третью строку с массивом strings(римский ввод цифр)
			if (useList(l, p) && useList(l, h)) {
				Roman gg = Roman.valueOf(y[0]);
				Roman g = Roman.valueOf(y[2]);
				int ii = gg.getValue();
				int oo = g.getValue();
//делаем арифметическое действие
				int sum;
				switch (z) {
					case "+":
						 sum = ii + oo;
						 Convert num = new Convert(sum);
						break;
					case "-":
						 sum = ii - oo;
						if (sum > 0) {
							Convert num1 = new Convert(sum);
						} else {
							off();
						}
						break;
					case "*":
						sum = ii * oo;
						Convert num2 = new Convert(sum);
						break;
					case "/":
						sum = ii / oo;
						Convert num3 = new Convert(sum);
						break;
					default:
						off();
				}
//проверяем наличие арабских цифр
			} else if (useList(q, p) && useList(q, h)) {
//преобразуем строку в int
				int i = Integer.parseInt(y[0]);
				int o = Integer.parseInt(y[2]);
//делаем арифметическое действие
				switch(z) {
					case "+":
						System.out.print(i + o);
						break;
					case "-":
						System.out.print(i - o);
						break;
					case "*":
						System.out.print(i * o);
						break;
					case "/":
						System.out.print(i / o);
						break;
					default:
						off();
				}
			} else {
				off();
			}
		} else {
			off();
		}

	}
}