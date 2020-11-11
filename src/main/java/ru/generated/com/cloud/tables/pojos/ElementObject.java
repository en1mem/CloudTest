/*
 * This file is generated by jOOQ.
*/
package ru.generated.com.cloud.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ElementObject implements Serializable {

    private static final long serialVersionUID = -381342371;

    private Long      id;
    private Long      entityId;
    private Boolean   isActual;
    private String    status;
    private Timestamp lastUpdateDateTime;
    private String    businessField;

    public ElementObject() {}

    public ElementObject(ElementObject value) {
        this.id = value.id;
        this.entityId = value.entityId;
        this.isActual = value.isActual;
        this.status = value.status;
        this.lastUpdateDateTime = value.lastUpdateDateTime;
        this.businessField = value.businessField;
    }

    public ElementObject(
        Long      id,
        Long      entityId,
        Boolean   isActual,
        String    status,
        Timestamp lastUpdateDateTime,
        String    businessField
    ) {
        this.id = id;
        this.entityId = entityId;
        this.isActual = isActual;
        this.status = status;
        this.lastUpdateDateTime = lastUpdateDateTime;
        this.businessField = businessField;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEntityId() {
        return this.entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public Boolean getIsActual() {
        return this.isActual;
    }

    public void setIsActual(Boolean isActual) {
        this.isActual = isActual;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getLastUpdateDateTime() {
        return this.lastUpdateDateTime;
    }

    public void setLastUpdateDateTime(Timestamp lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
    }

    public String getBusinessField() {
        return this.businessField;
    }

    public void setBusinessField(String businessField) {
        this.businessField = businessField;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ElementObject (");

        sb.append(id);
        sb.append(", ").append(entityId);
        sb.append(", ").append(isActual);
        sb.append(", ").append(status);
        sb.append(", ").append(lastUpdateDateTime);
        sb.append(", ").append(businessField);

        sb.append(")");
        return sb.toString();
    }
}