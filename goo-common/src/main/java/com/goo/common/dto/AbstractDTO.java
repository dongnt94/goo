package com.goo.common.dto;

/**
 * Created by DongPT1 on 6/16/2017.
 */
public class AbstractDTO {
    private Long id;
    private Long version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}
