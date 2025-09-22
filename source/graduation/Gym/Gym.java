package source.graduation.Gym;

import java.util.Scanner;

public class Gym {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int calories = 0, amount = 0, time_in_minutes = 0;
        do {
            System.out.print("Quantos exercícios diferentes você fez hoje?");
            amount = input.nextInt();

            if (amount < 1) {
                System.out.println("\nVocê precisa ter praticado 1 ou mais exercícios!!\n");
            }
        } while (amount < 1);

        for (int i = 0; i < amount; i++) {
            do {
                System.out.print("Digite o tempo em minutos do " + (i + 1) + "° exercício: ");

                time_in_minutes += input.nextInt();

                if (time_in_minutes < 1) {
                    System.out.println("\nO tempo deve ser de 1 ou mais minutos!!\n");
                }
            } while (time_in_minutes < 1);
        }

        calories = time_in_minutes * 5;

        System.out.println("\nVocê gastou aproximadamente " + calories + " calorias no treino de hoje.");

        input.close();
    }

}
