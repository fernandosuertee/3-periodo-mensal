package model.reposity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import model.entity.Atendente;


import java.util.List;

public class AtendenteDAO extends GenericDAO<Atendente> {
    public AtendenteDAO() {
        super(Atendente.class);
    }

    public List<Atendente> findByName(String nome) {
        EntityManager em = Persistence.createEntityManagerFactory("projetoPU").createEntityManager();
        TypedQuery<Atendente> query = em.createQuery("SELECT a FROM Atendente a WHERE a.nome = :nome", Atendente.class);
        query.setParameter("nome", nome);
        return query.getResultList();
    }
}
