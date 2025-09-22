package source.graduation.GasStation;

import java.util.Scanner;

public class GasStation {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int total_clients = 0;

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
            clients[i] = createClient(fuels);
        }

        printSales(clients);

    }

    static Client createClient(Fuel[] fuelsOptions) {
        int selectedFuelType;

        double fuelAmount;

        do {
            System.out.println("Selecione o tipo de combustível ");
            System.out.println(" 1 - Gasolina\n 2 - Etanol\n 3 - Diesel");
            System.out.print("Tipo = ");
            selectedFuelType = input.nextInt();
            if (selectedFuelType < 1 || selectedFuelType > 3) {
                System.out.println("Ops! Opção inválida!!!");
            } else {
                break;
            }

        } while (true);

        System.out.print("Insira a quantidade de litros: ");
        fuelAmount = input.nextDouble();

        // decremento to match the index
        selectedFuelType--;

        return new Client(fuelsOptions[selectedFuelType], fuelAmount);
    }

    static void printSales(Client[] totalclients) {
        // tipos
        int dieselCounter = 0, gasolineCounter = 0, etanolCounter = 0;
        double totalCost = 0;

        // TODO, counter inside class...
        for (Client client : totalclients) {
            totalCost += client.getCost();

            if (client.getFuelType() == "Gasolina") {
                gasolineCounter += 1;
            } else if (client.getFuelType() == "Etanol") {
                etanolCounter += 1;
            } else {

                dieselCounter += 1;
            }
        }

        System.out.println("Total de vendas:" + totalCost);
        System.out.println("Total de carros abastecido com Gasolina:" + gasolineCounter);
        System.out.println("Total de carros abastecido com Etanol:" + etanolCounter);
        System.out.println("Total de carros abastecido com Diesel:" + dieselCounter);

    }

}
