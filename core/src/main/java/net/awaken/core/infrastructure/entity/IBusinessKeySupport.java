package net.awaken.core.infrastructure.entity;

import java.io.Serializable;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 12.01.2018
 */
public interface IBusinessKeySupport<BusinessKey extends Serializable> {

    BusinessKey getBusinessKey();

}
