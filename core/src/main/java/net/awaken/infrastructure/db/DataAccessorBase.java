package net.awaken.infrastructure.db;

import java.io.Serializable;

public abstract class DataAccessorBase<K extends Serializable, P extends Persistent<K>> implements DataAccessor<K, P> {

}
