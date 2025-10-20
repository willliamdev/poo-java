# Herança, Polimorfismo e Encapsulamento

##   Código inicial fornecido

```java
// Código inicial: classe base Animal
public class Animal {

    // Atributos existentes
    public String nome;
    public int idade;

    // Método existente
    public void emitirSom() {
        System.out.println("Este animal está emitindo um som.");
    }

    // Método privado de exemplo
    private void metodoPrivado() {
        System.out.println("Este é um método privado da classe Animal.");
    }

}
```

---

## Instruções da atividade

- [x] Criar novos atributos na classe Animal:
    - Um atributo público.
        - *color*
    - Um atributo privado.
        - *habitat*
        - *sex*
        - *noise* 
        - *energy*
- [x] Criar um construtor público na classe Animal que inicialize todos os atributos, e que chame ao menos um método privado da própria classe.
    - *chamando o método `hello()` ao instanciar um novo animal*
- [x] Criar duas subclasses da classe Animal.
    - *Dog*
    - *Cat*
- [x] Nas subclasses aplicar Polimorfismo e Encapsulamento
    - *Polimorfismo aplicado em makeNoise().*
    - *Encapsulamento aplicado em atributos privados como isTrained, breed e lives.*