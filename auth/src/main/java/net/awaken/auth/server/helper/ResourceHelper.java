package net.awaken.auth.server.helper;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 12.01.2018
 */
public interface ResourceHelper {

    ResourceInfo get(String identifier);

    ResourceInfo get(Long id);
}
