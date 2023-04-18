package com.company.scfcm.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.Store;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@JmixEntity
@Store(name = "scfcm")
@Table(name = "CM_RELATION")
@Entity(name = "cm_Relation")
public class Relation {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @NotNull
    @Column(name = "RELA_TYPE", nullable = false, length = 30)
    private String type;

    @NotNull
    @Column(name = "CODE", nullable = false, length = 30)
    private String code;

    @NotNull
    @InstanceName
    @Column(name = "NAME", nullable = false, length = 50)
    private String name;

    @NotNull
    @Column(name = "LOCAL_NAME", nullable = false, length = 50)
    private String localName;

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}