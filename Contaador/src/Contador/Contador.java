package Contador;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro par�metro");
		int parametroUm = sc.nextInt();
		System.out.println("Digite o segundo par�metro");
		int parametroDois = sc.nextInt();
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			System.out.println("Segundo par�metro deve ser maior que o primeiro");
		}
		
		sc.close();
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException	{
		if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("ParametroUm � MAIOR que parametroDois");
        }
		
		int contagem = parametroDois - parametroUm;
		for(int i = 0; i <= contagem; i++) {
			System.out.println("Imprimindo o numero " + i);
		}
	}
}