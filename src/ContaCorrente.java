package src;

public class ContaCorrente {
    private int numero;
    private String titular;
    private float saldo = 0.0f;

    public ContaCorrente(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public boolean sacar(float valor) {
        if (valor < 0 || valor > 10_000 || this.saldo < valor) return false;
        saldo -= valor;
        return true;
    }

    public boolean depositar(float valor) {
        if (valor < 0 || valor > 10_000) return false;
        saldo += valor;
        return true;
    }

    public float consultarSaldo() {
        return saldo;
    }
}
