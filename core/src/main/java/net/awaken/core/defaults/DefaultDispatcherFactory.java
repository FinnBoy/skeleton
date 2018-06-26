package net.awaken.core.defaults;

import net.awaken.core.Dispatcher;
import net.awaken.core.DispatcherFactory;
import net.awaken.core.HandlerCriteria;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public class DefaultDispatcherFactory implements DispatcherFactory {

    @Override
    public Dispatcher create(HandlerCriteria criteria) {
        return new DefaultDispatcher(criteria);
    }
}
