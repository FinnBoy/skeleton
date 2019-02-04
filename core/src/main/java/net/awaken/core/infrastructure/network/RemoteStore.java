package net.awaken.core.infrastructure.network;

/**
 * Common Data Access API
 *
 * @param <Req>
 * @param <Resp>
 * @author Finn Zhao
 * @version 1.0
 * @since 2019.02.01
 */
public interface RemoteStore<Req extends Request, Resp extends Response> {

    Message<Resp> call(Req request);

    StoreOption getOption();
}
