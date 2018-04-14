package net.awaken.infrastructure;

import java.util.Set;

public interface RemoteStore<Req extends Request, Resp extends Response> {

    void push(StoreOption option, Req request);

    Resp pull(StoreOption option, Req request);

    void rpcPush(Integer rpcOption, Req request);

    Resp rpcPull(Integer rpcOption, Req request);

    Set<Store> getStores();

    Set<RpcStore> getRpcStores();

    Store getStore(StoreOption option);

    RpcStore getRpcStore(Integer rpcOption);

}
