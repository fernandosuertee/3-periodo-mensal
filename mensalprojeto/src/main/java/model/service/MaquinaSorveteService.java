package model.service;

import model.entity.MaquinaSorvete;
import model.reposity.MaquinaSorveteDAO;

import java.util.List;

public class MaquinaSorveteService {
    private MaquinaSorveteDAO maquinaSorveteDAO = new MaquinaSorveteDAO();

    public void save(MaquinaSorvete maquinaSorvete) {
        maquinaSorveteDAO.create(maquinaSorvete);
    }

    public MaquinaSorvete findById(Long id) {
        return maquinaSorveteDAO.read(id);
    }

    public void update(MaquinaSorvete maquinaSorvete) {
        maquinaSorveteDAO.update(maquinaSorvete);
    }

    public void delete(MaquinaSorvete maquinaSorvete) {
        maquinaSorveteDAO.delete(maquinaSorvete);
    }

    public List<MaquinaSorvete> findAll() {
        return maquinaSorveteDAO.findAll();
    }

    public List<MaquinaSorvete> findByCapacidade(int capacidade) {
        return maquinaSorveteDAO.findByCapacidade(capacidade);
    }
}
