package currencydao;

import currencyentity.Currency;
import java.util.List;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class CurrencyDao {

    public EntityManager getEntityManager() {
        return MyEntityManager.getEntityManager();
    }

    public void addCurrency(Currency c) {

        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();

        } catch (EntityExistsException ex) {
            System.err.println("The person Currency does already exist in the system");

            //catch (exception that handles commit problem?)
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Currency getCurrencyByName(String name) {

        EntityManager em = getEntityManager();
        try {
            TypedQuery<Currency> q = em.createQuery("Select c from Currency c where c.name = :name", Currency.class);
            return q.setParameter("name", name).getSingleResult();
        } finally {
            em.close();
        }

    }

    public List<Currency> getAllCurrency() {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("Select c from Currency c").getResultList();
        } finally {
            em.close();
        }

    }

}
