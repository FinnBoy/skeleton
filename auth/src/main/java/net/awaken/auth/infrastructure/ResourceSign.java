package net.awaken.auth.infrastructure;

/**
 * 受保护的
 * <p>实现该接口的类，作为受保护的资源，受到权限管控。</p>
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public interface ResourceSign extends Entry<String> {

    /**
     * get resource.
     *
     * @return resource
     */
    Resource getResource();

}
