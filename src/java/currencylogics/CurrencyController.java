package currencylogics;

import currencydao.CurrencyDao;
import currencyentity.Currency;
import currencypojo.CurrencyShell;
import java.util.Map;

public class CurrencyController {

    CurrencyDao cd = new CurrencyDao();

    public void createCurrency(CurrencyShell cs) {

        for (Map.Entry<String, Double> entry : cs.getRates().entrySet()) {
            Currency c = new Currency(entry.getKey(), entry.getValue());
            cd.addCurrency(c);

        }
    }

//    public Currency getCurrencyByName(String s) {
//
//    }
}
