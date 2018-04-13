package net.awaken.domain;

/**
 * Domain Service.
 */
public interface Service<C extends Criteria, V extends ValueObject> {

    V execute(C criteria);
}
