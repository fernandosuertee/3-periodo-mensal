package model.service;

import model.entity.Atendente;
import model.reposity.AtendenteDAO;

import java.util.List;

public class AtendenteService {
    private AtendenteDAO atendenteDAO = new AtendenteDAO();

    public void save(Atendente atendente) {
        atendenteDAO.create(atendente);
    }

    public Atendente findById(Long id) {
        return atendenteDAO.read(id);
    }

    public void update(Atendente atendente) {
        atendenteDAO.update(atendente);
    }

    public void delete(Atendente atendente) {
        atendenteDAO.delete(atendente);
    }

    public List<Atendente> findAll() {
        return atendenteDAO.findAll();
    }

    public List<Atendente> findByName(String nome) {
        return atendenteDAO.findByName(nome);
    }
}
