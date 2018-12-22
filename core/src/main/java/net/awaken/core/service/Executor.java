package net.awaken.core.service;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 12.01.2018
 */
public interface Executor<Req extends Request, Resp extends Response> {

    Resp execute(Req req);
}
