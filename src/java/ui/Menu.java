package ui;

import java.util.Scanner;
import client.RestClient;
import currencyentity.Currency;
import currencylogics.CurrencyController;
import java.util.List;

public class Menu {

    public static Scanner sc = new Scanner(System.in);

    public void menu1() {

        System.out.println("Welcome to my currency rate project!");
        boolean loop = true;
        while (loop) {
            System.out.println("1. Print the latest price for over 300 currencies that are compared with Euro");
            System.out.println("2. Print a list for over 300 currencies that are compared with Euro during a specifik time in history ");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:\n");
            CurrencyController cc = new CurrencyController();
            RestClient rc = new RestClient();
            int input = sc.nextInt();
            sc.nextLine();
            switch (input) {
                case 1:
                    System.out.println(rc.client("http://data.fixer.io/api/latest?access_key=93c83c2929256213aba41d6809f95038"));
                    break;
                case 2:
                    //get list dosen't work
                    System.out.println("Enter the date you whant to see by writing the date in format YYYY-MM-DD");
                    String s = sc.nextLine();
                    // cc.createCurrency(rc.client("http://data.fixer.io/api/" + s + "?access_key=93c83c2929256213aba41d6809f95038"));
                    //cc.getHistoricalCurrencyList().forEach(System.out::println);
                    break;
                case 3:
                    System.out.println("Enter the date you whant to see by writing the date in format YYYY-MM-DD");
                    String s1 = sc.nextLine();
                    //cc.createCurrency(rc.client("http://data.fixer.io/api/latest?access_key=93c83c2929256213aba41d6809f95038"));
                    //  cc.compareLatestHistoricalCurrency();
                    cc.compareCurrencyHist(rc.client("http://data.fixer.io/api/latest?access_key=93c83c2929256213aba41d6809f95038"), rc.client("http://data.fixer.io/api/" + s1 + "?access_key=93c83c2929256213aba41d6809f95038"));
                case 0:
                    loop = false;
                    break;
            }
        }
    }
}
