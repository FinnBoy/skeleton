package net.awaken.core.resource;

import net.awaken.core.*;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public class ChainScanner implements Scanner, Handler {

    private Scanner scanner;

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Resource seek(String location) {
        return this.scanner.seek(location);
    }

    @Override
    public Resource[] seek(String[] locations) {
        return this.scanner.seek(locations);
    }

    @Override
    public void handle(Dispatcher dispatcher, HandlerChain chain) {

        Criteria criteria = dispatcher.getCriteria();

        if (isIllegal(criteria)) {
            throw new IllegalArgumentException("Criteria is not appropriate for Scanner.");
        }

        if (isLiterals(criteria)) {
            String location = this.getLocation(criteria);
            Resource resource = this.seek(location);

            if (resource != null) {
                dispatcher.wrapResult(resource);
                return;
            }
        }

        if (isLiteralsArray(criteria)) {
            String[] locations = this.getLocations(criteria);
            Resource[] resources = this.seek(locations);

            if (resources != null) {
                dispatcher.wrapResult(resources);
                return;
            }
        }

        chain.proceed(dispatcher);
    }

    protected boolean isIllegal(Criteria criteria) {
        if (!criteria.wrapped()) {
            return true;
        }
        State.WrappedType type = criteria.getWrappedType();
        if (!State.WrappedType.LiteralsArray.equals(type) && !State.WrappedType.Literals.equals(type)) {
            return true;
        }
        return false;
    }

    protected boolean isLiterals(Criteria criteria) {
        if (State.WrappedType.Literals.equals(criteria.getWrappedType())) {
            return true;
        }
        return false;
    }

    protected boolean isLiteralsArray(Criteria criteria) {
        if (State.WrappedType.LiteralsArray.equals(criteria.getWrappedType())) {
            return true;
        }
        return false;
    }

    private String[] getLocations(Criteria criteria) {
        return (String[]) criteria.getWrapped();
    }

    private String getLocation(Criteria criteria) {
        return (String) criteria.getWrapped();
    }
}
