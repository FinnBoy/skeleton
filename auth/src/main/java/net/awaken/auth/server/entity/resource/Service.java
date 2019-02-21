package net.awaken.auth.server.entity.resource;

import net.awaken.auth.server.entity.Resource;

/**
 * 服务/接口
 * <p>
 * 服务权限{@link net.awaken.auth.server.entity.ResourceTypeAction}：
 * 1、使用
 * </p>
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 02.01.2019
 */
public class Service extends Resource {

    private App app;

    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
    }

}
