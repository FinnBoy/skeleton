package net.awaken.auth.infrastructure;

/**
 * 主体
 * <p>the subject interface only pay attention to authorization.</p>
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public interface Subject {

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
    SubjectPrivilege privilege();

    /**
     * get profile.
     *
     * @return profile
     */
    Profile profile();

    /**
     * delegate someone role.(i.e. the "someone" is a mandatary.)
     * 将自己的某项角色特权 临时委托授权给 另个主体
     *
     * @param another mandatary(proxy) subject
     * @param role    delegated role
     */
    void delegate(Subject another, String role);

    /**
     * cancel delegating someone role.
     * 取消 之前的临时委托
     *
     * @param another mandatary(proxy) subject
     * @param role    canceled role
     */
    void cancel(Subject another, String role);

    /**
     * grant someone role.
     * 将自己的某项角色特权 授权给 另个主体
     *
     * @param another another subject
     * @param role    granted role
     */
    void grant(Subject another, String role);

    /**
     * revoke someone role.
     *
     * @param another another subject
     * @param role    revoked role
     */
    void revoke(Subject another, String role);

    /**
     * verify whether has the permission of this resource.
     *
     * @param resource resource
     * @param action   permission action
     * @return true if have permission of this resource, or not.
     */
    boolean verify(String resource, Integer action);

}
