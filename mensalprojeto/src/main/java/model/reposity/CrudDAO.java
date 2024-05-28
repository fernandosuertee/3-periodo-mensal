package model.reposity;

import java.util.List;

public interface CrudDAO<T> {
    void create(T entity);
    T read(Object id);
    void update(T entity);
    void delete(T entity);
    List<T> findAll();
}
