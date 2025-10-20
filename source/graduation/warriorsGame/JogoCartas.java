import java.util.Scanner;
/*
Grupo:
    - William de Almeida
    - Marcus Viicius
    - Lara Gabriely
    - Leonardo Araujo
*/

class Guerreiro {
    String nome;
    int forca, velocidade, inteligencia, defesa, magia;

    Guerreiro(String nome, int forca, int velocidade, int inteligencia, int defesa, int magia) {
        this.nome = nome;
        this.forca = forca;
        this.velocidade = velocidade;
        this.inteligencia = inteligencia;
        this.defesa = defesa;
        this.magia = magia;
    }

    void mostrarAcoes() {
        System.out.println("\n===== " + nome + " =====");
        System.out.println("Força: " + forca + " → Usa sua força para DESTRUIR o inimigo!");
        System.out.println("Velocidade: " + velocidade + " → Usa sua velocidade para ACELERAR!");
        System.out.println("Inteligência: " + inteligencia + " → Usa sua inteligência para PLANEJAR ataques!");
        System.out.println("Defesa: " + defesa + " → Usa sua defesa para BLOQUEAR golpes!");
        System.out.println("Magia: " + magia + " → Usa sua magia para CANALIZAR energia espiritual!");
        System.out.println("============================\n");
    }
}

public class JogoCartas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cada guerreiro inspirado nas vocações do Tibia (1000 pontos no total)
        Guerreiro[] guerreiros = {
                new Guerreiro("Alexandre de Morais", 350, 150, 100, 300, 100),
                new Guerreiro("Donald Trump", 250, 250, 150, 200, 150),
                new Guerreiro("Jones Manoel Gomes", 100, 150, 300, 100, 350),
                new Guerreiro("Zé Felipe", 100, 150, 200, 200, 300),
                new Guerreiro("Dilma Roussef", 250, 450, 100, 100, 100)
        };

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("=== JOGO DE CARTAS: GUERREIROS ===");
            for (int i = 0; i < guerreiros.length; i++) {
                System.out.println((i + 1) + " - " + guerreiros[i].nome);
            }
            System.out.println("0 - Sair");
            System.out.print("Escolha um guerreiro: ");
            opcao = sc.nextInt();

            if (opcao >= 1 && opcao <= guerreiros.length) {
                Guerreiro g = guerreiros[opcao - 1];
                g.mostrarAcoes();
            } else if (opcao == 0) {
                System.out.println("\nSaindo do jogo... Até logo!");
            } else {
                System.out.println("\nOpção inválida! Tente novamente.\n");
            }
        }

        sc.close();
    }
}
