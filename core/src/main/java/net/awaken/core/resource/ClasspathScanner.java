package net.awaken.core.resource;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public class ClasspathScanner implements Scanner {

    @Override
    public Resource seek(String location) {
        return null;
    }

    @Override
    public Resource[] seek(String[] location) {
        return new Resource[0];
    }
}
