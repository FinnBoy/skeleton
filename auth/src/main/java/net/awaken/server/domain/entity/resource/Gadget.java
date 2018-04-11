package net.awaken.server.domain.entity.resource;

/**
 * 小件
 */
public interface Gadget extends Resource {

    /**
     * get option.
     *
     * @return option
     * @see net.awaken.server.domain.constant.GadgetOption
     */
    Integer getOption();

    Module getModule();

    Aggregation getAggregation();

    boolean belongTo(Aggregation aggregation);

    boolean belongTo(Module module);
}
