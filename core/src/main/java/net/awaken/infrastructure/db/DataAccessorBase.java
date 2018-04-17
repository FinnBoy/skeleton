package net.awaken.infrastructure.db;

import java.io.Serializable;

public abstract class DataAccessorBase<ID extends Serializable, P extends Persistent<ID>> implements DataAccessor<ID, P> {

}
