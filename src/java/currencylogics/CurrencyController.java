package currencylogics;

import currencyentity.Currency;
import currencypojo.CurrencyShell;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CurrencyController {

    private List<Currency> latestCurrencyList = new ArrayList<>();
    private List<Currency> historicalCurrencyList = new ArrayList<>();

    public List<Currency> getLatestCurrencyList() {
        return latestCurrencyList;
    }

    public void setLatestCurrencyList(List<Currency> latestCurrencyList) {
        this.latestCurrencyList = latestCurrencyList;
    }

    public List<Currency> getHistoricalCurrencyList() {
        return historicalCurrencyList;
    }

    public void setHistoricalCurrencyList(List<Currency> historicalCurrencyList) {
        this.historicalCurrencyList = historicalCurrencyList;
    }
//the if-statement dosen't work.

    public void createCurrency(CurrencyShell cs) {
        if (cs.getDate().equals(LocalDate.now().toString())) {
            for (Map.Entry<String, Double> entry : cs.getRates().entrySet()) {
                Currency c = new Currency(entry.getKey(), entry.getValue());
                latestCurrencyList.add(c);
            }
        } else {
            for (Map.Entry<String, Double> entry : cs.getRates().entrySet()) {
                Currency c = new Currency(entry.getKey(), entry.getValue());
                historicalCurrencyList.add(c);
            }
        }
    }
//fix this.

    public void compareLatestHistoricalCurrency() {

        //latestCurrencyList.stream().map()
        for (Currency currency : latestCurrencyList) {
            for (Currency currency1 : historicalCurrencyList) {
                if (currency.getName().equals(currency1.getName())) {
                    double i = currency.getRate() - currency1.getRate();
                    System.out.println(currency.getName() + " " + i + "diffrence in rate\n");
                } else {
                    System.out.println("FAIL");
                }
            }
        }

    }

}
