package model.reposity;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import model.entity.ClienteVisitante;


import java.util.List;

public class ClienteVisitanteDAO extends GenericDAO<ClienteVisitante> {
    public ClienteVisitanteDAO() {
        super(ClienteVisitante.class);
    }

    public List<ClienteVisitante> findByCpf(String cpf) {
        EntityManager em = Persistence.createEntityManagerFactory("projetoPU").createEntityManager();
        TypedQuery<ClienteVisitante> query = em.createQuery("SELECT c FROM ClienteVisitante c WHERE c.cpf = :cpf", ClienteVisitante.class);
        query.setParameter("cpf", cpf);
        return query.getResultList();
    }

    public EntityManager getEntityManager() {
        return Persistence.createEntityManagerFactory("projetoPU").createEntityManager();
    }

    public void create(ClienteVisitante clienteVisitante) {
        EntityManager em = getEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(clienteVisitante);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public ClienteVisitante read(String cpf) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ClienteVisitante.class, cpf);
        } finally {
            em.close();
        }
    }

    public void update(ClienteVisitante clienteVisitante) {
        EntityManager em = getEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.merge(clienteVisitante);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public void delete(ClienteVisitante clienteVisitante) {
        EntityManager em = getEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.remove(em.merge(clienteVisitante));
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public List<ClienteVisitante> findAll() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<ClienteVisitante> query = em.createQuery("SELECT c FROM ClienteVisitante c", ClienteVisitante.class);
            return query.getResultList();
        } finally {
            em.close();
        }
    }
}
