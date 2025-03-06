package desafios.sintaxe.entities;

public class Conta {
    private String codigoConta;
    private int agencia;
    private String nome;
    private double saldo;

    public Conta(String codigoConta, int agencia, String nome, double saldo) {
        this.codigoConta = codigoConta.trim();
        this.agencia = agencia;
        this.nome = nome.trim();
        this.saldo = saldo;
    }

    public String getcodigoConta() {
        return codigoConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta de " + nome + ", agência " + agencia + ", número de conta " + codigoConta + ", saldo em conta " +
                "R$" + saldo;
    }
}
