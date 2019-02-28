package currencyfordb;

import java.util.Map;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Currency {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Double rate;

    public Currency() {
    }

    public Currency(String name, Double rate) {
        this.name = name;
        this.rate = rate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public void setNameAndRate(Map<String, Double> cs) {

        for (Map.Entry<String, Double> entry : cs.entrySet()) {

            name = entry.getKey();
            rate = entry.getValue();

        }

    }

}
