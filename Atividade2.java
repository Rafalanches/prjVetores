package PctVetores;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] vetorCoatch = new int[10], vetorDiferenciado = new int[10];
		int ajudinha=2;
		Scanner MusicaTop = new Scanner(System.in);     

	       for(int i=0;i<10;i++) {

	           System.out.println("Digite um valor");
	           vetorCoatch[i]=MusicaTop.nextInt();
	           
	           for(int i1=0;i1<10;i1++) {
	        	   vetorDiferenciado[i1] = ajudinha * vetorCoatch[i1];
	           }
	           System.out.println(vetorDiferenciado[i]);
	       }
	}
}