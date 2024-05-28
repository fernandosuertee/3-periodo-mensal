package model.service;

import model.entity.ClienteVisitante;
import model.reposity.ClienteVisitanteDAO;

import java.util.List;

public class ClienteVisitanteService {
    private final ClienteVisitanteDAO clienteVisitanteDAO = new ClienteVisitanteDAO();

    public void save(ClienteVisitante clienteVisitante) {
        clienteVisitanteDAO.create(clienteVisitante);
    }

    public ClienteVisitante findById(Long id) {
        return clienteVisitanteDAO.read(id);
    }

    public void update(ClienteVisitante clienteVisitante) {
        clienteVisitanteDAO.update(clienteVisitante);
    }

    public void delete(ClienteVisitante clienteVisitante) {
        clienteVisitanteDAO.delete(clienteVisitante);
    }

    public List<ClienteVisitante> findAll() {
        return clienteVisitanteDAO.findAll();
    }

    public List<ClienteVisitante> findByCpf(String cpf) {
        return clienteVisitanteDAO.findByCpf(cpf);
    }
}
