package Calculadora;

import java.util.Scanner;

public class Multiplicar {
	
	double x,y;
	
	public Multiplicar() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce el primer factor");
		x=sc.nextDouble();
		
		System.out.println("Introduce el segundo factor");
		y=sc.nextDouble();
		
	}
	
	public void Resultado_Multiplicar() {
		
		System.out.println("Resultado de "+ x +" x "+ y+ " = "+ x * y);
		
	}

}
