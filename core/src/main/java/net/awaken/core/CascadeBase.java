package net.awaken.core;

import java.io.Serializable;
import java.util.Collections;
import java.util.Optional;
import java.util.Set;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 12.01.2018(jdk1.8)
 */
public abstract class CascadeBase<E, ID extends Serializable> implements Cascade<E, ID> {

    public CascadeBase(E superior, Set<E> subordinates) {
        this.superior = Optional.of(superior);
        this.subordinates = subordinates;
        this.multiSuperiors = Collections.emptySet();
    }

    public CascadeBase(Set<E> multiSuperiors, Set<E> subordinates) {
        this.superior = Optional.empty();
        this.subordinates = subordinates;
        this.multiSuperiors = multiSuperiors;
    }

    final private Optional<E> superior;

    final private Set<E> subordinates;

    final private Set<E> multiSuperiors;

    @Override
    public Set<E> subordinates() {
        return subordinates;
    }

    @Override
    public E superior() {
        return superior.get();
    }

    @Override
    public boolean hasMultiSuperiors() {
        return multiSuperiors != null && !multiSuperiors.isEmpty();
    }

    @Override
    public Set<E> multiSuperiors() {
        return multiSuperiors;
    }

    @Override
    public boolean containsSubordinate(E subordinate) {
        return subordinates.contains(subordinate);
    }

    @Override
    public E searchSubordinate(ID subordinateId) {
        throw new UnsupportedOperationException();
    }

}
