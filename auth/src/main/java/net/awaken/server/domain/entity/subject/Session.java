package net.awaken.server.domain.entity.subject;

import net.awaken.server.domain.entity.permission.Privilege;
import net.awaken.server.domain.entity.resource.Module;

import java.util.Set;

public interface Session {

    /**
     * get principal.
     *
     * @return principal
     */
    Principal getPrincipal();

    /**
     * get module.
     *
     * @return module
     */
    Module getModule();

    /**
     * get activate privileges concerned.
     *
     * @return privileges
     */
    Set<Privilege> getPrivileges();
}
