# Exercício: Criando uma Classe de Conta Bancária 
Você vai treinar orientação a objetos em Java, criando uma classe simples chamada ContaBancaria.
## Estrutura da Classe
A classe deve ter atributos (características) e métodos (ações):

### Atributos (informações da conta):
```
String titular → nome do dono da conta
double saldo → valor que tem na conta
```

### Métodos (o que a conta pode fazer):

```
void depositar(double valor) → aumenta o saldo
void sacar(double valor) → diminui o saldo (mas só se tiver dinheiro suficiente)
void exibirSaldo() → mostra na tela o nome do titular e o saldo atual
```


## Regras de Negócio
- [x] O método depositar deve somar o valor ao saldo.
- [x] O método sacar deve verificar antes se o saldo é suficiente. Se for, desconta. Se não for, mostra uma mensagem de erro.
- [x] O método exibirSaldo deve imprimir algo como:
    - `Titular: João - Saldo: 250.0`


## O método main (programa principal)
No main, você deve:
- Criar duas contas bancárias (dois objetos gerados apartir da classe).
- Definir titular e saldo inicial de cada uma.
- Fazer algumas operações de depósito e saque.
- Mostrar os resultados na tela usando o método exibirSaldo().




