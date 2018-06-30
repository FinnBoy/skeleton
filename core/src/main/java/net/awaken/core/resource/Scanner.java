package net.awaken.core.resource;

/**
 * Strategy interface for scanning resources (e.. class path or file system
 * resources).
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public interface Scanner {

    Resource seek(String location);

    Resource[] seek(String[] location);
}
