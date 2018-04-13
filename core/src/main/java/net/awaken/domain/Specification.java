package net.awaken.domain;

import java.util.Set;

/**
 * Specification.
 */
public interface Specification<T extends Entity> {

    Set<T> satisfyingElementsFrom(Repository<T> repository);

    boolean isSatisfiedBy(Entity entity);

    Specification<T> and(Specification<T> specification);

    Specification<T> or(Specification<T> specification);

    Specification<T> not();
}
