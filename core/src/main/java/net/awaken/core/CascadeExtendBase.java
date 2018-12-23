package net.awaken.core;

import java.io.Serializable;
import java.util.Collections;
import java.util.Optional;
import java.util.Set;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 12.01.2018
 */
public abstract class CascadeExtendBase<E, ID extends Serializable> extends CascadeBase<E, ID> implements CascadeExtend<E, ID> {

    public CascadeExtendBase(Set<E> subordinates) {
        super(Optional.empty(), //
                subordinates, //
                Collections.emptySet());
    }

    public CascadeExtendBase(E superior, Set<E> subordinates) {
        super(Optional.of(superior), //
                subordinates, //
                Collections.emptySet());
    }

    public CascadeExtendBase(Set<E> multiSuperiors, Set<E> subordinates) {
        super(Optional.empty(), //
                subordinates, //
                multiSuperiors);
    }

    @Override
    public void addSubordinate(E node) {
        this.subordinates.add(node);
    }
}
