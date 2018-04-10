package net.awaken.server.domain.entity.subject;

import java.util.Set;

/**
 * 组
 */
public interface Group extends Subject {

    Set<Principal> getPrincipals();

}
