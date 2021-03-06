package net.awaken.core.linq.operation.union;

import java.util.Collection;

/**
 *
 * @param <Left>
 * @param <Right>
 * @param <Result>
 */
public interface MRecord<Left, Right, Result> {

    Collection<Left> leftBeans();

    Collection<Right> rightBeans();

    boolean singleLeft();

    boolean singleRight();

    Left leftBean();

    Right rightBean();

    void addResult(Result result);

    Collection<Result> results();
}
