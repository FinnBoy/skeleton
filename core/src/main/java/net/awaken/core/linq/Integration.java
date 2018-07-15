package net.awaken.core.linq;

/**
 * handle with the datas of two types, and set result to a new type.
 *
 * @param <Main>
 * @param <Additional>
 * @param <Result>
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public interface Integration<Main, Additional, Result> {
    Result merge(Main main, Additional additional);
}
