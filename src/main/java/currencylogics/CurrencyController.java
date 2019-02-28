package currencylogics;

import currencydao.CurrencyDao;
import currencyentity.Currency;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;

public class CurrencyController {

    @Inject
    CurrencyDao cd;

    List<Currency> currencyList;

    Currency c;

    public void setNameAndRate(Map<String, Double> cs) {

        for (Map.Entry<String, Double> entry : cs.entrySet()) {

            c.setName(entry.getKey());
            c.setRate(entry.getValue());
            cd.addCurrency(c);
            //currencyList.add(c);

        }

    }

    public List<Currency> getCurrency() {
        return cd.getAllCurrency();
    }

    public Currency getCurrency(String name) {
        return cd.getCurrencyByName(name);
    }

}
