package net.awaken.infrastructure;

public interface RemoteStore<Req extends Request, Resp extends Response> {

    void push(StoreOption option, Req request);

    Resp pull(StoreOption option, Req request);

    void rpcPush(Integer rpcOption, Req request);

    Resp rpcPull(Integer rpcOption, Req request);
}
