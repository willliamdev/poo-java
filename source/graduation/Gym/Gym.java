package source.graduation.Gym;

import java.util.Scanner;

public class Gym {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int calories = 0, amount = 0, time_in_minutes = 0;
        do {
            System.out.println("Quantos exercícios diferentes você fez hoje?");
            amount = input.nextInt();

            if (amount < 1) {
                System.out.println("Você precisa ter praticado 1 ou mais exercícios!!");
            }
        } while (amount < 1);

        for (int i = 0; i < amount; i++) {
            do {
                System.out.println("Digite o tempo em minutos do " + (i + 1) + "° exercício:");

                time_in_minutes += input.nextInt();

                if (time_in_minutes < 1) {
                    System.out.println("O tempo deve ser de 1 ou mais minutos!!");
                }
            } while (time_in_minutes < 1);
        }

        calories = time_in_minutes * amount * 5;

        System.out.println("Você gastou aproximadamente " + calories + " calorias no treino de hoje.");


        input.close();
    }

}
