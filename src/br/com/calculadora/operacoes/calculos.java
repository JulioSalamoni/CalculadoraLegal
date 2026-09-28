package br.com.calculadora.operacoes;

public class calculos {

    public double somar(double num1, double num2) {
        return num1 + num2;
    }

    public double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public double dividir(double num1, double num2) {
        return num1 / num2;
    }

    public double raiz(double num1) {
        return Math.sqrt(num1);
    }

    public double potencia(double num1, double num2) {
        return Math.pow(num1, num2);
    }
}