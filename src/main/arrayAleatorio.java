package main;

public class arrayAleatorio {

	public static void main(String[] args) {
		// Crea un método en java para insertar en un array 20 números aleatorios entre 1 y 10
		
		int array[] = new int[20];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math. random()*10+1);
		}
		
		imprimir(array);
	}
	
	public static void imprimir(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(i + ",");
		}
		
	}

}
