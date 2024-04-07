//Escreva um programa em Java que leia dois números e solicite o tipo de operação a ser realizada. As operações podem ser: soma, subtração, multiplicação e divisão. Para realizar os cálculos, programe uma classe que será responsável por realizar o cálculo e programe uma classe chamada ProgramaCalculadora que será responsável por executar o programa que solicitará do usuário os dois números para uma operação que também deve ser informada por ele.
import java.util.Scanner;
public class Q3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.println("Digite a operação desejada (+, -, *, /): ");
        String operacao = scanner.next();
        double resultado = 0;
        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operação inválida!");
                break;
        }
        if (resultado != 0) {
            System.out.println("O resultado da operação é: " + resultado);
        }
    }
}