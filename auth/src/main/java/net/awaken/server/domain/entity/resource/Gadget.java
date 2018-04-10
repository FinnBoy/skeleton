package net.awaken.server.domain.entity.resource;

/**
 * 小件
 */
public interface Gadget extends Resource {

    /**
     * get division.
     *
     * @return division
     */
    Integer getDivision();

    Module getModule();

    Aggregation getAggregation();

    boolean belongTo(Aggregation aggregation);

    boolean belongTo(Module module);
}
