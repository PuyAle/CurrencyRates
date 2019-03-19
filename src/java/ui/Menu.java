package ui;

import apikey.ApiKey;
import java.util.Scanner;
import client.RestClient;

import currencylogics.CurrencyController;

public class Menu {

    public static Scanner sc = new Scanner(System.in);

    public void menu1() {

        System.out.println("Welcome to my currency rate project!");
        boolean loop = true;
        while (loop) {
            System.out.println("1. Print the latest price for over 300 currencies that are compared with Euro");
            System.out.println("2. Print a list for over 300 currencies that are compared with Euro during a specifik time in history ");
            System.out.println("3. Compare the rates for currencies between a historical rate and the latest rate");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:\n");
            CurrencyController cc = new CurrencyController();
            RestClient rc = new RestClient();
            ApiKey ak = new ApiKey();
            int input = sc.nextInt();
            sc.nextLine();
            switch (input) {
                case 1:
                    System.out.println(rc.client("http://data.fixer.io/api/latest?access_key=" + ak.getApiKey()));
                    break;
                case 2:
                    //get list dosen't work
                    System.out.println("Enter the date you whant to see by writing the date in format YYYY-MM-DD");
                    String s = sc.nextLine();
                    // cc.createCurrency(rc.client("http://data.fixer.io/api/" + s + "?access_key=myKey"));
                    //cc.getHistoricalCurrencyList().forEach(System.out::println);
                    break;
                case 3:
                    System.out.println("Enter the date you whant to see by writing the date in format YYYY-MM-DD");
                    String s1 = sc.nextLine();
                    cc.compareCurrencyHist(rc.client("http://data.fixer.io/api/latest?access_key=" + ak.getApiKey()));
                case 0:
                    loop = false;
                    break;
            }
        }
    }
}
