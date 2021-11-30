package main;

import java.util.Arrays;

public class arrayAleatorio {

	public static void main(String[] args) {
		// Crea un método en java para insertar en un array 20 números aleatorios entre
		// 1 y 10

		int array[] = new int[30];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10 + 1);
		}

		imprimir(array);
		contarNumeros(array);
		//contarNumeros(array);
	}

	public static void imprimir(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(i + ",");
		}

	}

	public static void contarNumeros(int[] array) {

		Arrays.sort(array);
		int contador = 0;
		int aux = array[0];

		System.out.println("");
		for (int i = 0; i < array.length; i++) {

			if (aux == array[i]) {
				contador++;
			} else {
				System.out.println("El número " + aux + " se repite " + contador + " veces");
				contador = 1;
				aux = array[i];
			}
		}
		System.out.println("El número " + aux + " se repite " + contador + " veces");

	}

}
