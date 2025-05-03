[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/zaY_p4dR)

# Questão 1:

```
Explique por que é considerado boa prática usar getters e setters em vez de tornar os atributos públicos em uma classe.
Dê um exemplo onde usar um setter permite controlar melhor a integridade dos dados de um objeto.
```

O uso de getters e setters permite que o desenvolvedor consiga restringir e adicionar lógica extra
no ato de obter ou definir um valor em uma propriedade de uma instância de uma classe.

Por exemplo:

```java
class Questao1 {
    private int idade;
    
    public Questao1(int idade) {
        this.setIdade(idade);
    }
    
    public void setIdade(int idade) {
        if (idade < 0 || idade > 150) { throw new Error('Idade invalida!'); }
        this.idade = idade;
    }
    
    public string toString() {
        return this.idade + " anos de idade";
    }
    
    public int getIdade() {
        return this.idade;
    }
}
```

Nesse código a idade é garantida a ser um número inteiro entre 0 e 150 visto que o setter
restringe idade, já idade pode ser obtida como número, porem, também pode ser obtida como
uma string com o método `toString` que adiciona um texto predefinido ao valor.

# Questão 2:

```
Considere que você está modelando um sistema de controle de biblioteca.

Responda:
    a) Quais informações você considera relevantes para representar um livro em um sistema?
    b) Por que podemos dizer que uma classe Livro seria uma abstração no seu código?
    c) Liste ao menos 3 métodos que fariam sentido existir nessa classe.
```


a) algumas propriedades que livro poderia ter no sistema são
- Título
- Autor
- Preço
- Categoria
- Estoque


b) É uma abstração porque simplifica o conceito de livro no sistema a somente seus componentes necessários
para o funcionamento do sistema, ignorando fatores irrelevantes.


c) alguns métodos poderiam ser:
- `emprestar()`
- `devolver()`
- `adicionarDesconto()`
