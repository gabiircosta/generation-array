package ExerciArray; // Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
					// atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.

import java.util.Scanner;

public class Exerc�cio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		
		int i;//i=position
		int vet[] = new int[5],soma=0;
	
		
		for (i=0;i<5;i++)
		{
			System.out.printf("Ente com o %do valor da atividade: ",i+1);
			vet[i] = ler.nextInt();
		}
		int menor=vet[0],maior=vet[0];
		
		for(i=0;i<5;i++)
		{
			soma = soma + vet[i];
			if(vet[i]<menor)
			{
				menor = vet[i];
			}
			
			if(vet[i]>maior)
			{
				maior = vet[i];
			}
		}
		//Sa�da dos dados
		
		System.out.printf("\n");
		for(i=0;i<5;i++)
		{
			if(vet[i] == maior)
			{
				System.out.printf("Vet[%d] = %2d <-- Maior valor \n",i+1,vet[i]);
			}
			else
			{
				System.out.printf("Vet[%d] = %2d\n",i+1,vet[i]);
			}
		}

	}
}
