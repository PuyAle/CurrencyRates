package currencydao;

import Entity.Currency;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateless
public class CurrencyDao {

    @PersistenceContext
    EntityManager em;

    public void addCurrency(Currency c) {
        em.persist(c);
    }

    public void editCurrency(Currency c) {
        em.merge(c);
    }

    public void removeCurrency(Currency c) {

        em.remove(em.merge(c));
    }

    public Currency getCurrencyByName(String name) {

        TypedQuery<Currency> q = em.createQuery("Select c from Currency c where c.name = :name", Currency.class);
        return q.setParameter("name", name).getSingleResult();
    }

}
