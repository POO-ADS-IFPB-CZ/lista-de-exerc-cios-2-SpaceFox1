package src;

import src.utils.Caixa;
import src.utils.Scanner;

public class Questao4 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner();
        int numero = scanner.askInt("Número da conta: ");
        String titular = scanner.askString("Nome do titular: ");

        ContaCorrente conta = new ContaCorrente(numero, titular);

        Caixa menu = new Caixa("Operações da conta: " + numero);
        menu.writeLine("1 - Sacar valor");
        menu.writeLine("2 - Depositar valor");
        menu.writeLine("3 - Consultar saldo");
        menu.writeLine("4 - Sair");

        while (true) {
            System.out.println("\033\143"); // limpa o console
            menu.draw();
            int choice = scanner.askInt("");

            if (choice == 1) {
                float valorSaque = scanner.askInt("Valor do saque: ");
                boolean sucesso = conta.sacar(valorSaque);
                System.out.println(sucesso ? "Valor sacado com sucesso!" : "Valor de saque invalido!");
            } else if (choice == 2) {
                float valorDeposito = scanner.askInt("Valor do deposito: ");
                boolean sucesso = conta.depositar(valorDeposito);
                System.out.println(sucesso ? "Valor depositado com sucesso!" : "Valor de deposito invalido!");
            } else if (choice == 3) {
                System.out.println("Saldo da conta: " + conta.consultarSaldo());
            } else if (choice == 4) {
                break;
            }

            Thread.sleep(1000);
        }
    }
}
