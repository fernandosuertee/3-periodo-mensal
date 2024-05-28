package model.service;


import model.entity.Pedido;
import model.reposity.PedidoDAO;

import java.util.List;

public class PedidoService {
    private PedidoDAO pedidoDAO = new PedidoDAO();

    public void save(Pedido pedido) {
        pedidoDAO.create(pedido);
    }

    public Pedido findById(Long id) {
        return pedidoDAO.read(id);
    }

    public void update(Pedido pedido) {
        pedidoDAO.update(pedido);
    }

    public void delete(Pedido pedido) {
        pedidoDAO.delete(pedido);
    }

    public List<Pedido> findAll() {
        return pedidoDAO.findAll();
    }

    public List<Pedido> findByStatus(String status) {
        return pedidoDAO.findByStatus(status);
    }
}
