package org.example;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o nome do titular !");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o saldo !");
        double saldo = scanner.nextDouble();

        System.out.println("Por favor, digite a Agência !");
        String agencia1 = scanner.next();




        System.out.println("Obrigado pelas informações, os dados inseridos foram:\nNome titular: " + nomeCliente + "\nAgência: " + agencia1 + "\nConta: " + numero + "\nSaldo: " + saldo);
        scanner.close();


    }
}
