package net.awaken.auth.infrastructure;

/**
 * （主体）特权
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public interface Privilege {

    /**
     * get subject.
     *
     * @return subject
     */
    Subject getSubject();

    /**
     * verify whether has the permission of this resource.
     *
     * @param resource resource
     * @param action   permission action
     * @return true if have permission of this resource, or not.
     */
    boolean verify(String resource, Integer action);

}
