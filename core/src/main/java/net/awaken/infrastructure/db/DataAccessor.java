package net.awaken.infrastructure.db;

import java.io.Serializable;
import java.util.List;

public interface DataAccessor<ID extends Serializable, P extends Persistent<ID>> {

    void save(P persistent);

    void update(P persistent);

    void delete(P persistent);

    P load(ID id);

    P get(ID id);

    P single(Restriction restriction);

    List<P> list(Restriction restriction);

}
