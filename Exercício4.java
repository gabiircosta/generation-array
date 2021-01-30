package ExerciArray;

import java.util.Scanner;
public class Exercício4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][]= new int[3][3];
		int l,c,somamat=0,somadiagonal=0;
		
		Scanner ler = new Scanner (System.in);
		
		for (l=0;l<3;l++)
		{
			for (c=0;c<3;c++)
			{
				System.out.printf("\nEntre com o valor da Matriz [%d][%d]: ",(l+1),(c+1));
				mat [l][c] = ler.nextInt();
			
			somamat = somamat+mat[l][c];
			
				if (l==c)
				{
				somadiagonal = somadiagonal + mat[l][c];
				}
			}
		}
		System.out.println("\nO valor do somatório total é: "+somamat);
		System.out.println("\nO valor do somatório da diagonal principal é: "+somadiagonal);
	}
}
