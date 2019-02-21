package net.awaken.auth.server.entity.resource;

import net.awaken.auth.server.entity.Resource;

import java.util.Set;

/**
 * 模块
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 02.01.2019
 */
public class Module extends Resource {

    private Set<App> apps;

    public Set<App> getApps() {
        return apps;
    }

    public void setApps(Set<App> apps) {
        this.apps = apps;
    }
}
