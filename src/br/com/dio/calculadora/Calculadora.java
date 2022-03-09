package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        float a, b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextFloat();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextFloat();

        float somar = somar((int) a, (int)b);
        float subtrair = subtrair((int) a, (int)b);
        float multiplicar = multiplicar((int) a, (int)b);
        float dividir = dividir((int) a, (int)b);

        System.out.println("somar: " + somar);
        System.out.println("subt: " + subtrair);
        System.out.println("mult: " + multiplicar);
        System.out.println("div: " + dividir);

    }

    public static float somar(int a, int b){
        return a + b;
    }

    public static float subtrair(int a, int b){
        return a - b;
    }

    public static float multiplicar(int a, int b){
        return a * b;
    }

    public static float dividir(int a, int b){
        return a / b;
    }




}
