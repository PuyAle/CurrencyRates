package currencylogics;

import currencydao.CurrencyDaoTest;
import currencyentity.Currency;
import currencypojo.CurrencyShell;
import java.util.Map;

public class CurrencyController {

    CurrencyDaoTest cd = new CurrencyDaoTest();

    public void setNameAndRate(CurrencyShell cs) {

        for (Map.Entry<String, Double> entry : cs.getRates().entrySet()) {
            Currency c = new Currency(entry.getKey(), entry.getValue());
            cd.addCurrency(c);

        }
    }
}
