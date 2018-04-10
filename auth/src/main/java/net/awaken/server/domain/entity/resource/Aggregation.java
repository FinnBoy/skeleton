package net.awaken.server.domain.entity.resource;

import java.util.Set;

/**
 * 聚合体
 */
public interface Aggregation extends Resource {

    Set<Module> getModules();

    boolean contains(Module module);

    boolean contains(Gadget gadget);
}
