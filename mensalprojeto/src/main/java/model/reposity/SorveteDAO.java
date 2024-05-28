package model.reposity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import model.entity.Sorvete;


import java.util.List;

public class SorveteDAO extends GenericDAO<Sorvete> {
    public SorveteDAO() {
        super(Sorvete.class);
    }

    public List<Sorvete> findBySabor(String sabor) {
        EntityManager em = Persistence.createEntityManagerFactory("projetoPU").createEntityManager();
        TypedQuery<Sorvete> query = em.createQuery("SELECT s FROM Sorvete s WHERE s.sabor = :sabor", Sorvete.class);
        query.setParameter("sabor", sabor);
        return query.getResultList();
    }


}

