package br.fag.calculator;
public class Calculadora implements OperacoesMatematicas {
    public void soma(float num1,float num2){
        float resultado = num1 + num2;
        System.out.println("a soma dos dois números é = " + resultado);
    }


    public void subtracao(float num1, float num2) {
        float resultado = num1 - num2;
        System.out.println("O resultado da subtração é = " + resultado);

    }

    public void multiplicacao(float num1, float num2) {
        float resultado = num1 + num2;
        System.out.println("O resultado da multiplicação é = " + resultado);
    }

    public void divisao(float num1, float num2) {
        float resultado = num1 / num2;
        System.out.println("O resultado da divisão é = " + resultado);
    }
}



