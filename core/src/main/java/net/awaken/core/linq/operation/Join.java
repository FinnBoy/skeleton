package net.awaken.core.linq.operation;

import net.awaken.core.linq.constant.JoinMode;

/**
 * @param <Left>
 * @param <Right>
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018(1.5)
 */
public interface Join<Left, Right> extends Union<Left, Right> {

    /**
     * return JoinMode.
     *
     * @return join mode
     */
    JoinMode mode();

    /**
     * set join mode:<br/>
     * 1. left join<br/>
     * 2. right join<br/>
     * 3. inner join
     *
     * @param joinMode
     * @return self
     */
    Join<Left, Right> mode(JoinMode joinMode);

}
