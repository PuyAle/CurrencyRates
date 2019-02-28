package currencydao;

import currencyentity.Currency;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;

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
//
//    public void editCurrency(Currency c) {
//        em.merge(c);
//    }
//
//    public void removeCurrency(Currency c) {
//
//        em.remove(em.merge(c));
//    }
//
//    public Currency getCurrencyByName(String name) {
//
//        TypedQuery<Currency> q = em.createQuery("Select c from Currency c where c.name = :name", Currency.class);
//        return q.setParameter("name", name).getSingleResult();
//    }
//
//    public List<Currency> getAllCurrency() {
//        return em.createQuery("Select c from Currency c").getResultList();
//    }

}
