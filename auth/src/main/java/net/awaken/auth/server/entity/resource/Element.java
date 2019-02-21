package net.awaken.auth.server.entity.resource;

import net.awaken.auth.server.entity.Resource;

/**
 * 页面元素
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 02.01.2019
 */
public class Element extends Resource {

    private Page page;

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

}
