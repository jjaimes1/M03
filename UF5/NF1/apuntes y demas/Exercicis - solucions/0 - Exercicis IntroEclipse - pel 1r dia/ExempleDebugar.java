package com.lau.classe1;

public class ExempleDebugar {
	public static void main(String[] args) {
		int[] myIntArray = { 1, 2, 3, 2, 4 };
		System.out.println("El resultat es " + sumaElements(myIntArray));
		System.out.println("El resultat es " + pendents(myIntArray));

	}

	public static int sumaElements(int[] vec) {
		int resultat = 0;
		for (int i = 1; i < vec.length; i++) {
			resultat = resultat + vec[i];
		}
		return resultat;
	}

	public static int pendents(int[] vec) {
		int resultat = 0;

		for (int i = 1; i < vec.length - 1; i++) {
			if (vec[i] > vec[i - 1] && vec[i] > vec[i + 1]) {
				resultat++;
			} else {
				if (vec[i] < vec[i - 1] && vec[i] < vec[i + 1]) {
					resultat++;
				}
			}
		}

		return resultat;
	}
}
