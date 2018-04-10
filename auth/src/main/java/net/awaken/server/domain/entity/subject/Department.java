package net.awaken.server.domain.entity.subject;

import java.util.Set;

/**
 * 部门
 */
public interface Department extends Subject {

    /**
     * get principals.
     *
     * @return principals
     */
    Set<Principal> getPrincipals();

    /**
     * get 下级部门
     *
     * @return subordinates
     */
    Set<Department> getSubordinates();

    /**
     * get 上级部门
     *
     * @return superior
     */
    Department getSuperior();

    /**
     * 从属于此部门.
     *
     * @param superior
     * @return true if it subordinate to this superior.
     */
    boolean isSubordinateTo(Department superior);

    /**
     * 是否含有此下级部门.
     *
     * @param subordinate
     * @return true if has this subordinate.
     */
    boolean containsSubordinate(Department subordinate);

    /**
     * 含有该当事人
     *
     * @return
     */
    boolean contains(Principal principal);
}
