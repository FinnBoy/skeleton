package net.awaken.server.domain.entity.resource;

import java.util.Set;

/**
 * 模块
 */
public interface Module extends Resource {

    /**
     * get form.
     *
     * @return form
     */
    Integer getForm();

    Aggregation getAggregation();

    Set<Gadget> getGadgets();

    boolean contains(Gadget gadget);
}
