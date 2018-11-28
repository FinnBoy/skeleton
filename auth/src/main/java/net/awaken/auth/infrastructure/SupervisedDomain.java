package net.awaken.auth.infrastructure;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface SupervisedDomain {

    /**
     * The resource identifier which will be used to check permission.
     */
    String identifier();

}
