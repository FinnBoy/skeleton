package net.awaken.core.dao;

import net.awaken.core.entity.Entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 12.01.2018
 */
public interface IdDAO<ID extends Serializable, E extends Entity<ID>> {

    /**
     * create a new entity.
     *
     * @param entity entity
     */
    void create(E entity);

    /**
     * delete a entity from persistence~layer.
     *
     * @param entity entity
     */
    void delete(E entity);

    /**
     * update a entity from persistence~layer.
     *
     * @param entity entity
     */
    void update(E entity);

    /**
     * get entity by id.
     *
     * @param id entity id
     * @return specified entity
     */
    E get(ID id);

    /**
     * get total entities.
     *
     * @return total entities
     */
    List<E> total();
}
