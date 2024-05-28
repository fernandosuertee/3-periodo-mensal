package model.reposity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import model.entity.Pedido;

import java.util.List;

public class PedidoDAO extends GenericDAO<Pedido> {
    public PedidoDAO() {
        super(Pedido.class);
    }

    public List<Pedido> findByStatus(String status) {
        EntityManager em = Persistence.createEntityManagerFactory("projetoPU").createEntityManager();
        TypedQuery<Pedido> query = em.createQuery("SELECT p FROM Pedido p WHERE p.statusPedido = :status", Pedido.class);
        query.setParameter("status", status);
        return query.getResultList();
    }
}
