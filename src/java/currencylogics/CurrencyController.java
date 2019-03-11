package currencylogics;

import currencyentity.Currency;
import currencypojo.CurrencyShell;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CurrencyController {

    public List<Currency> compareCurrencyHist(CurrencyShell cs, CurrencyShell cs1) {

        double diffValue = 0;
        double percentDiff = 0;
        List<Currency> currencyList = new ArrayList<>();

        for (Map.Entry<String, Double> entry : cs.getRates().entrySet()) {
            for (Map.Entry<String, Double> entry1 : cs1.getRates().entrySet()) {
                if (entry.getKey().equals(entry1.getKey())) {
                    diffValue = entry.getValue() - entry1.getValue();
                    percentDiff = (entry.getValue() / entry1.getValue() - 1) * 100;
                    Currency c = new Currency(entry.getKey(), entry.getValue(), diffValue, percentDiff);
                    currencyList.add(c);
                }
            }
        }
        return currencyList;
    }

}
