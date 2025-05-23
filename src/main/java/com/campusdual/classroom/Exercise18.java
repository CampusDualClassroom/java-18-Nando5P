package com.campusdual.classroom;

import com.campusdual.util.Utils;

public class Exercise18 {

	public static void main(String[] args) {
		int n = Utils.integer("Introduce el tamaño del array: ");
		while (n < 0) {
			n = Utils.integer("Por favor, introduce un tamaño válido (mayor o igual a 0): ");
		}
		int[] array = createAndInitializeArray(n);
		showInlineArray(array);
	}

	// Metodo para el test
	public static int[] createAndInitializeArray(int n) {
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = i + 1;
		}
		return array;
	}
	// Metodo para interaccion de usuario
	/* public static int[] createAndInitializeArray(int n) {
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			int value = Utils.integer("Introduce un número natural para la posición " + (i + 1) + ": ");
			while (value < 0) {
				value = Utils.integer("Por favor, introduce un número natural (mayor o igual a 0): ");
			}
			array[i] = value;
		}
		return array;
	}
	*/


	public static void showInlineArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
