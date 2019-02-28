package currencylogics;

import currencydao.CurrencyDao;
import currencyentity.Currency;
import currencypojo.CurrencyShell;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CurrencyController {

    CurrencyDao cd = new CurrencyDao();

    public void setNameAndRate(CurrencyShell cs) {

        List<Currency> currencyList = new ArrayList<>();
        String name = null;
        Double rate = null;
        for (Map.Entry<String, Double> entry : cs.getRates().entrySet()) {
            name = entry.getKey();
            rate = entry.getValue();
            boolean loop = true;
            while (loop) {
                Currency c = new Currency(name, rate);
                currencyList.add(c);
                loop = false;
            }

        }

        currencyList.forEach((currency) -> {
            System.out.println(currency);
        });

        for (Currency currency : currencyList) {
            if (currency != null) {
                cd.addCurrency(currency);
            }
        }
    }

//    public List<Currency> getCurrency() {
//        return cd.getAllCurrency();
//    }
//
//    public Currency getCurrency(String name) {
//        return cd.getCurrencyByName(name);
//    }
}
