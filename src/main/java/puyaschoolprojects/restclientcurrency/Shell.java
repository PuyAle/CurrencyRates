package puyaschoolprojects.restclientcurrency;

import java.util.Map;

public class Shell {

    //private String eur;
    private String date;
    private String base;
    private Map<String, Double> currencies;
    //private Date dateTime;

    public Map<String, Double> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(Map<String, Double> currencies) {
        this.currencies = currencies;
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

}
