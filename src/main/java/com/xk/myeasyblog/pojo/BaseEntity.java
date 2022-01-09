package com.xk.myeasyblog.pojo;

import java.util.Date;

public class BaseEntity {

    private Date timeCreated;

    private Date timeModified;

    private String idUserCreated;

    private String idUserModified;

    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    public Date getTimeModified() {
        return timeModified;
    }

    public void setTimeModified(Date timeModified) {
        this.timeModified = timeModified;
    }

    public String getIdUserCreated() {
        return idUserCreated;
    }

    public void setIdUserCreated(String idUserCreated) {
        this.idUserCreated = idUserCreated;
    }

    public String getIdUserModified() {
        return idUserModified;
    }

    public void setIdUserModified(String idUserModified) {
        this.idUserModified = idUserModified;
    }
}
