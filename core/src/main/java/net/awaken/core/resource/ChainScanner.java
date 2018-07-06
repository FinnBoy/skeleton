package net.awaken.core.resource;

import net.awaken.core.*;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public class ChainScanner extends ScannerBase implements Handler {

    private Scanner scanner;

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Resource seek(String location) {
        return this.scanner.seek(location);
    }

    @Override
    public Resource[] seekAll(String locationPattern) {
        return this.scanner.seekAll(locationPattern);
    }

    @Override
    public void handle(Dispatcher dispatcher, HandlerChain chain) {
        Criteria criteria = dispatcher.getCriteria();
        if (isIllegal(criteria)) {
            throw new IllegalArgumentException("Criteria is not appropriate for Scanner.");
        }
        String location = this.getLocation(criteria);
        if (containsWildcard(location)) {
            dispatcher.wrapResult(seekAll(location));
        } else {
            dispatcher.wrapResult(seek(location));
        }
        chain.proceed(dispatcher);
    }

    protected boolean isIllegal(Criteria criteria) {
        if (!criteria.wrapped()) {
            return true;
        }
        State.WrappedType type = criteria.getWrappedType();
        if (!State.WrappedType.Literals.equals(type)) {
            return true;
        }
        return false;
    }

    private String getLocation(Criteria criteria) {
        return (String) criteria.getWrapped();
    }
}
