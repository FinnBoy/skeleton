package net.awaken.auth.server.entity.resource;

import net.awaken.auth.server.entity.Resource;

import java.util.Set;

/**
 * 菜单
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
