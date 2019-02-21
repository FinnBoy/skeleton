package net.awaken.auth.server.entity.resource;

import net.awaken.auth.server.entity.Resource;

/**
 * 数据表上的一条记录
 * <p>
 * 记录权限{@link net.awaken.auth.server.entity.ResourceTypeAction}：
 * 1、释放（查询/使用）限制
 * </p>
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 02.01.2019
 */
public class Record extends Resource {

    private Table table;

    private Long recordId;

    private String recordCode;

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public String getRecordCode() {
        return recordCode;
    }

    public void setRecordCode(String recordCode) {
        this.recordCode = recordCode;
    }

}
