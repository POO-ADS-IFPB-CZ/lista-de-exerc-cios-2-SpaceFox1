package src;

// Questão 3
public class Produto {
    private int codigo;
    private String nome;
    private double preco;
    private int estoque;

    public Produto(int codigo, String nome, double preco, int estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.setPreco(preco);
        this.estoque = estoque;
    }

    public int getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getEstoque() {
        return estoque;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            throw new Error("Preço invalido!");
        }
        this.preco = preco;
    }

    public void exibirInfo() {
        System.out.println("#------------------");
        System.out.println("| Código: " + codigo);
        System.out.println("| Nome: " + nome);
        System.out.println("| preço: " + preco);
        System.out.println("| Estoque: " + estoque);
        System.out.println("#------------------");
    }
}
