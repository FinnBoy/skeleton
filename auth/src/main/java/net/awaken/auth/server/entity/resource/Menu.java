package net.awaken.auth.server.entity.resource;

import net.awaken.auth.server.entity.Resource;

import java.util.Set;

/**
 * 菜单
 * <p>
 * 菜单权限{@link net.awaken.auth.server.entity.ResourceTypeAction}：
 * 1、显示（菜单）
 * </p>
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 02.01.2019
 */
public class Menu extends Resource {

    private App app;

    private Set<Page> pages;

    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
    }

    public Set<Page> getPages() {
        return pages;
    }

    public void setPages(Set<Page> pages) {
        this.pages = pages;
    }
}
