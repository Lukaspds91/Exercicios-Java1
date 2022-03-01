package br.com.generation.aula01;
import java.util.Scanner;

/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a
  expressa apenas em dias.*/

public class IdadeDiaMesAno {
	public static void main(String[] args){
		final short DIAS_NO_ANO = 365;
		final short DIAS_NO_MES = 30;
		short dias;
		short meses;
		short anos;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe a sua idade.");
		System.out.print("Anos: ");
		anos = leitor.nextShort();
		
		System.out.print("Meses: ");
		meses = leitor.nextShort();
		
		System.out.print("Dias: ");
		dias = leitor.nextShort();
		
		dias += (anos * DIAS_NO_ANO) + (meses * DIAS_NO_MES);
		
		System.out.println("\n\nA sua idade em dias é " + dias);
	}
}