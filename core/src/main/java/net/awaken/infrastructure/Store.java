package net.awaken.infrastructure;

/**
 * Store: 执行与Remote Server交互及前置、后置动作，包括访问前后的数据检查与格式转换.
 *
 * @param <Req>
 * @param <Resp>
 */
public interface Store<Req extends Request, Resp extends Response> {

    void push(Req request);

    Resp pull(Req request);

    Accessor getAccessor();
}
