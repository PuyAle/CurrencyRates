package puyaschoolprojects.restclientcurrency;

public class CurrencyShell {

    private String date;

    private String success;

    private Rates rates;

    private String timestamp;

    private String base;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public Rates getRates() {
        return rates;
    }

    public void setRates(Rates rates) {
        this.rates = rates;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "ClassPojo [date = " + date + ", success = " + success + ", rates = " + rates + ", timestamp = " + timestamp + ", base = " + base + "]";
    }
}
