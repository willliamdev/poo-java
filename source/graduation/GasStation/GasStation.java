package source.graduation.GasStation;

import java.util.Scanner;

public class GasStation {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int total_clients = 0;
        int option = 0;
        double fuel_amount = 0;

        Fuel[] fuels = new Fuel[3];

        fuels[0] = new Fuel("Gasolina", 5.8);
        fuels[1] = new Fuel("Etanol", 4.2);
        fuels[2] = new Fuel("Diesel", 4.9);

        do {
            System.out.print("Quantos carros foram abastecidos hoje? ");
            total_clients = input.nextInt();
            if (total_clients <= 0) {
                System.out.print("Ops!! Por favor insira uma quantidade correta de carros!!!");
            }
        } while (total_clients < 1);

        Client[] clients = new Client[total_clients];

        for (int i = 0; i < total_clients; i++) {
            System.out.println((i+1) + "º Cliente ---------------------");
            System.out.println("Selecione o tipo de combustível ");
            System.out.println(" 1 - Gasolina\n 2 - Etanol\n 3 - Diesel");
            System.out.print("Tipo = ");
            option = input.nextInt();

            System.out.print("Insira a quantidade de litros: ");
            fuel_amount = input.nextDouble();

            clients[i] = new Client(fuels[option - 1], fuel_amount);

        } 
        
        for (Client client : clients) {
            System.out.println(client.cost);

        }

    
    }





}
