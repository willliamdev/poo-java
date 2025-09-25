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

        printSales(clients, fuels);

    }

    static Client createClient(Fuel[] fuelsOptions) {
        int selectedFuelType;

        double fuelAmount;

        do {
            System.out.println("\n\nMenu de seleção combustível ");
            System.out.println(" 1 - Gasolina\n 2 - Etanol\n 3 - Diesel");
            System.out.print("Tipo = ");
            selectedFuelType = input.nextInt();

            if (selectedFuelType < 1 || selectedFuelType > 3) {
                System.out.println("Ops! Opção inválida!!!");
            } else {
                // decremento to match the index
                selectedFuelType--;
                fuelsOptions[selectedFuelType].saleCounter();
                break;
            }

        } while (true);

        System.out.print("\nInsira a quantidade de litros: ");
        fuelAmount = input.nextDouble();

        return new Client(fuelsOptions[selectedFuelType], fuelAmount);
    }

    static void printSales(Client[] totalclients, Fuel[] fuelsTypes) {
        // tipos
        double totalCost = 0;

        for (Client client : totalclients) {
            totalCost += client.getCost();
        }

        System.out.println("\n<<<<<<<<<<<<<<< Relatório do dia >>>>>>>>>>>>>>>");
        System.out.println("Total de vedas: R$" + totalCost);
        System.out.println("\nTotal de carros abastecido com Gasolina:" + fuelsTypes[0].getSalesCounter());
        System.out.println("Total de carros abastecido com Etanol:" + fuelsTypes[1].getSalesCounter());
        System.out.println("Total de carros abastecido com Diesel:" + fuelsTypes[2].getSalesCounter());

    }

}
