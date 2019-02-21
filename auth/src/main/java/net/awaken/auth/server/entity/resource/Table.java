package net.awaken.auth.server.entity.resource;

import net.awaken.auth.server.entity.Resource;

import java.util.Set;

/**
 * 数据表
 * <p>
 * 数据表权限{@link net.awaken.auth.server.entity.ResourceTypeAction}：
 * 1、限制使用/查询
 * </p>
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 02.01.2019
 */
public class Table extends Resource {

    private App app;

    private Set<Record> records;

    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
    }

    public Set<Record> getRecords() {
        return records;
    }

    public void setRecords(Set<Record> records) {
        this.records = records;
    }

}
