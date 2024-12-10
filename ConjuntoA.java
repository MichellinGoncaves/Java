package aula3;
import java.util.Scanner;

public class ConjuntoA {

	public static void main(String[] args) {
		int A[] = new int [4];
		int B[] = new int [4];
		int C[] = new int [4];
		int D[] = new int [4];
		
		Scanner entrada = new Scanner(System.in);
		//ADICIONA O VALOR DE CADA ELEMENTO AO TOTAL
		
	for(int i = 0; i<4; i++) {
		System.out.println("Digite %d valor para o valor A: ");
		A[i]=entrada.nextInt();
		System.out.println("Digite %d valor para o valor B: ");
		B[i]=entrada.nextInt();
		System.out.println("Digite %d valor para o valor C: ");
		C[i]=entrada.nextInt();
		System.out.println("Digite %d valor para o valor D: ");
		D[i]=entrada.nextInt();
		}
	
	for(int i: A){
		System.out.println(i+ " ");
	}
	
	for(int i: B){
		System.out.println(i+ " ");
	}
	for(int i: C){
		System.out.println(i+ " ");
	}
	for(int i: D){
		System.out.println(i+ " ");
	}

}

}
