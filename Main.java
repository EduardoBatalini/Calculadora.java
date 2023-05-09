package br.fag.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner read = new Scanner(System.in);
        int valor;
        float num1, num2;
        String escolha = "";
        while (true) {
            System.out.println("|---------------------------|");
            System.out.println("|qual operação deseja fazer?|");
            System.out.println("|1-adição                   |");
            System.out.println("|2-subtração.               |");
            System.out.println("|3-multiplicação.           |");
            System.out.println("|4-divisão.                 |");
            System.out.println("|___________________________|");
            valor = read.nextInt();

            switch (valor) {
                case 1:
                    System.out.println("digite o primeiro valor.");
                    num1 = read.nextFloat();

                    System.out.println("digite o segundo valor.");
                    num2 = read.nextFloat();
                    calc.soma(num1, num2);
                    read.nextLine();

                {
                    System.out.println("deseja fazer outra operação?[Sim/Não]");
                    escolha = read.nextLine();
                    if (escolha.equalsIgnoreCase("sim")) {
                        continue;

                    }else{
                        System.exit(0);
                    }
                }

                case 2:
                    System.out.println("digite o primeiro valor.");
                    num1 = read.nextFloat();

                    System.out.println("digite o segundo valor.");
                    num2 = read.nextFloat();
                    calc.subtracao(num1, num2);
                    read.nextLine();
                {
                    System.out.println("deseja fazer outra operação?[Sim/Não]");
                    escolha = read.nextLine();
                    if (escolha.equalsIgnoreCase("sim")) {
                        continue;

                    }else{
                        System.exit(0);
                    }
                }

                case 3:
                    System.out.println("digite o primeiro valor.");
                    num1 = read.nextFloat();

                    System.out.println("digite o segundo valor.");
                    num2 = read.nextFloat();
                    calc.multiplicacao(num1, num2);
                    read.nextLine();

                {
                    System.out.println("deseja fazer outra operação?[Sim/Não]");
                    escolha = read.nextLine();
                    if (escolha.equalsIgnoreCase("sim")) {
                        continue;

                    }else{
                        System.exit(0);
                    }
                }

                case 4:
                    System.out.println("digite o primeiro valor.");
                    num1 = read.nextFloat();

                    System.out.println("digite o segundo valor.");
                    num2 = read.nextFloat();
                    calc.divisao(num1, num2);
                    read.nextLine();
                    {
                        System.out.println("deseja fazer outra operação?[Sim/Não]");
                        escolha = read.nextLine();
                        if (escolha.equalsIgnoreCase("sim")) {
                        continue;

                        }else{
                            System.exit(0);
                        }
                    }
                default:
                    System.out.println("opção invalida");
                    break;
            }
        }
    }
}
