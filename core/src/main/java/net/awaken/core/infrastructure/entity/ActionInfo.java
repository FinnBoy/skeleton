package net.awaken.core.infrastructure.entity;

import java.util.Date;

/**
 * 操作信息
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 12.01.2018
 */
public class ActionInfo {

    private Date createdDate;

    private Date lastModifiedDate;

    private String createdBy;

    private String lastModifiedBy;

    private Boolean scrapped;

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Boolean getScrapped() {
        return scrapped;
    }

    public void setScrapped(Boolean scrapped) {
        this.scrapped = scrapped;
    }
}
