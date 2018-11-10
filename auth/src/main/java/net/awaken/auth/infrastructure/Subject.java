package net.awaken.auth.infrastructure;

import net.awaken.auth.Node;

/**
 * 主体
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public interface Subject extends Node<String, Subject> {

    /**
     * get account.
     *
     * @return account
     */
    Account account();

    /**
     * get privilege.
     *
     * @return privilege
     */
    Privilege privilege();

    /**
     * get profile.
     *
     * @return profile
     */
    Profile profile();

    /**
     * delegate someone role.
     * 将自己的某项角色特权 临时委托授权给 另个主体
     *
     * @param another
     * @param role
     */
    void delegate(Subject another, String role);

    /**
     * cancel delegating someone role.
     * 取消 之前的临时委托
     *
     * @param another
     * @param role
     */
    void cancel(Subject another, String role);

    /**
     * grant someone role.
     * 将自己的某项角色特权 授权给 另个主体
     *
     * @param another
     * @param role
     */
    void grant(Subject another, String role);

    /**
     * revoke someone role.
     *
     * @param another
     * @param role
     */
    void revoke(Subject another, String role);

}
