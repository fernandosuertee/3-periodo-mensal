package model.reposity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import model.entity.MaquinaSorvete;


import java.util.List;

public class MaquinaSorveteDAO extends GenericDAO<MaquinaSorvete> {
    public MaquinaSorveteDAO() {
        super(MaquinaSorvete.class);
    }

    public List<MaquinaSorvete> findByCapacidade(int capacidade) {
        EntityManager em = Persistence.createEntityManagerFactory("projetoPU").createEntityManager();
        TypedQuery<MaquinaSorvete> query = em.createQuery("SELECT m FROM MaquinaSorvete m WHERE m.capacidade = :capacidade", MaquinaSorvete.class);
        query.setParameter("capacidade", capacidade);
        return query.getResultList();
    }


}
