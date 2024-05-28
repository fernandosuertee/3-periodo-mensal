package model.service;

import model.entity.Sorvete;
import model.reposity.SorveteDAO;

import java.util.List;

public class SorveteService {
    private SorveteDAO sorveteDAO = new SorveteDAO();

    public void save(Sorvete sorvete) {
        sorveteDAO.create(sorvete);
    }

    public Sorvete findById(Long id) {
        return sorveteDAO.read(id);
    }

    public void update(Sorvete sorvete) {
        sorveteDAO.update(sorvete);
    }

    public void delete(Sorvete sorvete) {
        sorveteDAO.delete(sorvete);
    }

    public List<Sorvete> findAll() {
        return sorveteDAO.findAll();
    }

    public List<Sorvete> findBySabor(String sabor) {
        return sorveteDAO.findBySabor(sabor);
    }
}
