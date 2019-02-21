package net.awaken.auth.server.entity.resource;

import net.awaken.auth.server.entity.Resource;

/**
 * 页面元素
 * <p>
 * 页面元素权限{@link net.awaken.auth.server.entity.ResourceTypeAction}：
 * 1、显示
 * 2、可操作
 * </p>
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
