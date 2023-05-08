package application;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre the number of tax payers: ");
        int n = sc.nextInt();

        List<Contribuinte> contribuinteList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + (i+1) + " data:");
            System.out.print("Individual or Company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double renda = sc.nextDouble();
            if (ch == 'i'){
                System.out.print("Health expenditures: ");
                double gastosSaude = sc.nextDouble();
                contribuinteList.add(new PessoaFisica(name, renda, gastosSaude));
            } else {
                System.out.print("Number of employees: ");
                int qtdeFuncionaros = sc.nextInt();
                contribuinteList.add(new PessoaJuridica(name,renda,qtdeFuncionaros));
            }

        }

        System.out.println();
        double somaArrecadacao = 0;

        System.out.println("TAXES PAID:");
        for (Contribuinte x : contribuinteList) {
            System.out.printf("%s : $ %.2f%n",x.getName(),x.impostoPago());
            somaArrecadacao += x.impostoPago();
        }

        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f%n", somaArrecadacao);

        sc.close();
    }
}
