package net.awaken.core;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 12.01.2018
 */
public abstract class CascadeExtendBase<E, ID extends Serializable> implements CascadeExtend<E, ID> {

    private E superior;

    private Set<E> subordinates = new LinkedHashSet<>();

    private Set<E> multiSuperiors;

    @Override
    public Set<E> subordinates() {
        return subordinates;
    }

    @Override
    public E superior() {
        return superior;
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

    @Override
    public void addSubordinate(E node) {
        this.subordinates.add(node);
    }

    @Override
    public void setSuperior(E superior) {
        this.superior = superior;
    }

    @Override
    public void setMultiSuperiors(Set<E> multiSuperiors) {
        this.multiSuperiors = multiSuperiors;
    }
}
