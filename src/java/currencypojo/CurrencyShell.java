package currencypojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CurrencyShell {

    private Boolean success;
    private Integer timestamp;
    private String base;
    private String date;
    //private Map<String, Double> rates = new HashMap<>();
    private List<Currency> currencies;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

//    public Map<String, Double> getRates() {
//        return rates;
//    }
//
//    public void setRates(Map<String, Double> rates) {
//        this.rates = rates;
//    }
    public List<Currency> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<Currency> currencies) {
        this.currencies = currencies;
    }

}

//
//    private String date;
//
//    private String success;
//
//    private Rates rates;
//
//    private String timestamp;
//
//    private String base;
//
//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }
//
//    public String getSuccess() {
//        return success;
//    }
//
//    public void setSuccess(String success) {
//        this.success = success;
//    }
//
//    public Rates getRates() {
//        return rates;
//    }
//
//    public void setRates(Rates rates) {
//        this.rates = rates;
//    }
//
//    public String getTimestamp() {
//        return timestamp;
//    }
//
//    public void setTimestamp(String timestamp) {
//        this.timestamp = timestamp;
//    }
//
//    public String getBase() {
//        return base;
//    }
//
//    public void setBase(String base) {
//        this.base = base;
//    }
//
//    @Override
//    public String toString() {
//        return "ClassPojo [date = " + date + ", success = " + success + ",+ rates = " + rates + ", timestamp = " + timestamp + ", base = " + base + "]";
//    }
//}
