package net.awaken.auth.server.entity;

import net.awaken.core.infrastructure.entity.EntityWithAction;

/**
 * 区分表
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public class Division extends EntityWithAction<Long> {

    private String category;

    private String code;

    private String name;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
