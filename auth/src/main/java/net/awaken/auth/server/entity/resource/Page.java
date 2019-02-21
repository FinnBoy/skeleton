package net.awaken.auth.server.entity.resource;

import net.awaken.auth.server.entity.Resource;

import java.util.Set;

/**
 * 页面
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 02.01.2019
 */
public class Page extends Resource {

    private Menu menu;

    private Set<Element> elements;

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Set<Element> getElements() {
        return elements;
    }

    public void setElements(Set<Element> elements) {
        this.elements = elements;
    }
}
