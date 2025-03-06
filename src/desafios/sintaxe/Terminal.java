package desafios.sintaxe;

import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos iniciar sua conta!");
        System.out.print("Agência: ");
        int agencia = sc.nextInt();

        System.out.print("Número de conta: ");
        String codigoConta = sc.next();

        sc.nextLine(); //limpar o buffer

        System.out.print("Titular da conta: ");
        String nome = sc.nextLine();

        System.out.print("Valor em conta: ");
        double saldo = sc.nextDouble();

        Conta conta = new Conta(codigoConta, agencia, nome, saldo);

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %s e seu " +
                        "saldo R$%.2f já está disponível para saque.",
                conta.getNome(), conta.getAgencia(), conta.getcodigoConta(), conta.getSaldo());

        sc.close();
    }
}
