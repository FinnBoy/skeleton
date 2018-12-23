package net.awaken.core.dao;

import net.awaken.core.entity.BusinessEntity;

import java.io.Serializable;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 12.01.2018
 */
public interface BusinessIdDAO<ID extends Serializable
        , BusinessId extends Serializable
        , E extends BusinessEntity<ID, BusinessId>> extends IdDAO<ID, E> {

    /**
     * get entity by id.
     *
     * @param businessId business id
     * @return specified entity
     */
    E getByBusinessId(BusinessId businessId);

}
