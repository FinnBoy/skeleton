package net.awaken.server.domain.entity.permission;

/**
 * 权限
 */
public interface Permission {

    /**
     * enum: read, insert, update, delete, execute
     *
     * @return
     */
    Integer getOperation();

    /**
     * enum: deny, authorize
     *
     * @return
     */
    Integer getState();
}
