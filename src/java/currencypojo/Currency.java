package currencypojo;

public class Currency {

    private String name;
    private double rate;
//    private double historicalPriceChange;
//    private double historicalPercentageChange;

    public Currency(String name, double rate/*, double historicalPriceChange, double historicalPercentageChange*/) {
        this.name = name;
        this.rate = rate;
//        this.historicalPriceChange = historicalPriceChange;
//        this.historicalPercentageChange = historicalPercentageChange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

//    public double getHistoricalPriceChange() {
//        return historicalPriceChange;
//    }
//
//    public void setHistoricalPriceChange(double historicalPriceChange) {
//        this.historicalPriceChange = historicalPriceChange;
//    }
//
//    public double getHistoricalPercentageChange() {
//        return historicalPercentageChange;
//    }
//
//    public void setHistoricalPercentageChange(double historicalPercentageChange) {
//        this.historicalPercentageChange = historicalPercentageChange;
//    }
    @Override
    public String toString() {
        return "Currency{name=" + name + ", rate=" + rate + '}';
    }

}
