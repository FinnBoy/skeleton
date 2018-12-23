package net.awaken.core.bean;

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

    public CascadeBase(Set<E> subordinates) {
        this(Optional.empty(), //
                Collections.unmodifiableSet(subordinates), //
                Collections.emptySet());
    }

    public CascadeBase(E superior, Set<E> subordinates) {
        this(Optional.of(superior), //
                Collections.unmodifiableSet(subordinates), //
                Collections.emptySet());
    }

    public CascadeBase(Set<E> multiSuperiors, Set<E> subordinates) {
        this(Optional.empty(), //
                Collections.unmodifiableSet(subordinates), //
                Collections.unmodifiableSet(multiSuperiors));
    }

    protected CascadeBase(Optional<E> superior, Set<E> multiSuperiors, Set<E> subordinates) {
        this.superior = superior;
        this.multiSuperiors = multiSuperiors;
        this.subordinates = subordinates;
    }

    final protected Optional<E> superior;

    final protected Set<E> subordinates;

    final protected Set<E> multiSuperiors;

    @Override
    public boolean isRoot() {
        return !superior.isPresent();
    }

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
        throw new UnsupportedOperationException("implements it!");
    }

}
