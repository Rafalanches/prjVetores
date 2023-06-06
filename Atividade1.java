package PctVetores;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetorInterassado = new int[10];
		int ajudinha=0;
		Scanner GoatSimulator = new Scanner(System.in);     

	       for(int i=0;i<10;i++) {

	           System.out.println("Digite um valor");
	           vetorInterassado[i]=GoatSimulator.nextInt();
	       }
	       for(int i=0;i<10;i++) {
	    	   ajudinha = ajudinha + vetorInterassado[i];
	       }
	       if(ajudinha/10<7){
	    	   System.out.println("Sua média final será de "+ ajudinha/10 +". Você é um fracassado!" );
	       }else if(ajudinha/10>=7){
	    	   System.out.println("Sua média final será de "+ ajudinha/10 +". Meus Parabéns meu rei você passou!");
	       }
	}
	

}