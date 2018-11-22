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
     * get profile.
     *
     * @param authenticationToken authentication token
     * @return profile
     */
    SubjectProfile profile(Object authenticationToken);

    /**
     * delegate someone role.(i.e. the "someone" is a mandatary.)
     * 将自己的某项角色特权 临时委托授权给 另个主体
     *
     * @param mandatary mandatary(proxy) subject
     * @param role      delegated role
     */
    void delegate(Subject mandatary, String role);

    /**
     * cancel delegating someone role.
     * 取消 之前的临时委托
     *
     * @param mandatary mandatary(proxy) subject
     * @param role      canceled role
     */
    void cancel(Subject mandatary, String role);

    /**
     * grant someone role.
     * 将自己的某项角色特权 授权给 另个主体
     *
     * @param grantee grantee subject
     * @param role    granted role
     */
    void grant(Subject grantee, String role);

    /**
     * revoke someone role.
     *
     * @param grantee grantee subject
     * @param role    revoked role
     */
    void revoke(Subject grantee, String role);

    /**
     * verify whether has the permission of this resource.
     *
     * @param resource resource
     * @param action   permission action
     * @return true if have permission of this resource, or not.
     */
    boolean verify(String resource, Integer action);

}
