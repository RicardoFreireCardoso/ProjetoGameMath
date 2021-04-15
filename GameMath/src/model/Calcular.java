package model;

import java.util.Random;

public class Calcular {
	//atributos privados
	private int dificuldade;
	private int valor1;
	private int valor2;
	private int operacao;
	private int resultado;

	public Calcular(int dificuldade) {
		Random gerador = new Random();
		this.operacao = gerador.nextInt(3); // 0 - soma, 1 - subtração, 2 - multiplicação
		this.dificuldade = dificuldade;
		
		if(dificuldade == 1 ) {
			//facil
			this.valor1 = gerador.nextInt(10);
			this.valor2 = gerador.nextInt(10);
		} else if (dificuldade == 2) {
			//médio
			this.valor1 = gerador.nextInt(100);
			this.valor2 = gerador.nextInt(100);
		} else if(dificuldade == 3) {
			//dificil
			this.valor1 = gerador.nextInt(1000);
			this.valor2 = gerador.nextInt(1000);
		} else if (dificuldade == 4) {
			//mega
			this.valor1 = gerador.nextInt(10000);
			this.valor2 = gerador.nextInt(10000);
		} else {
			//ultra
			this.valor1 = gerador.nextInt(100000);
			this.valor2 = gerador.nextInt(100000);
		}
	} //construtor

	public int getDificuldade() {
		return dificuldade;
	}
	
	public int getValor1() {
		return valor1;
	}
	
	public int getValor2() {
		return valor2;
	}
	
	public int getOperacao() {
		return operacao;
	}
	public int getResultado() {
		return resultado;
	}
	public String toString() {
		String op;
		if(this.getOperacao() == 0) {
			op = "Somar";
		}else if (this.getOperacao() == 1) {
			op = "Dominuir";
		}else if(this.getOperacao() == 2) {
			op = "Multiplicar";
		} else {
			op = "Opção descohecida";
		}
		return "Valor 1: " + this.getValor1() +
				"\nValor 2: " + this.getValor2() +
				"\nDificuldade " + this.getDificuldade() +
				"\nOperação: " +op;
	}
	public boolean somar (int resposta) {
		this.resultado = this.getValor1() + this.getValor2();
		boolean certo = false;
		
		if(resposta == this.getResultado()) {
			System.out.println("Resposta correta!");
			certo = true;
		} else {
			System.out.println("Resposta incorreta!");
		}
		System.out.println(this.getValor1()+ " + " + this.getValor2() + " = " + this.getResultado());
		return certo;
	}
	public boolean diminuir (int resposta) {
		this.resultado = this.getValor1() - this.getValor2();
		boolean certo = false;
		
		if(resposta == this.getResultado()) {
			System.out.println("Resposta correta!");
			certo = true;
		} else {
			System.out.println("Resposta incorreta!");
		}
		System.out.println(this.getValor1()+ " - " + this.getValor2() + " = " + this.getResultado());
		return certo;
	}
	public boolean multiplicar (int resposta) {
		this.resultado = this.getValor1() * this.getValor2();
		boolean certo = false;
		
		if(resposta == this.getResultado()) {
			System.out.println("Resposta correta!");
			certo = true;
		} else {
			System.out.println("Resposta incorreta!");
		}
		System.out.println(this.getValor1()+ " * " + this.getValor2() + " = " + this.getResultado());
		return certo;
	}
	
}
