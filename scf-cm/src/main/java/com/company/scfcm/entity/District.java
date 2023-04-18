package com.company.scfcm.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.Store;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@JmixEntity
@Store(name = "scfcm")
@Table(name = "CM_DISTRICT", indexes = {
        @Index(name = "IDX_CM_DISTRICT_CITY", columnList = "CITY_ID"),
        @Index(name = "IDX_CM_DISTRICT_COUNTRY", columnList = "COUNTRY_ID")
})
@Entity(name = "cm_District")
public class District {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @NotNull
    @Column(name = "CODE", nullable = false, length = 10)
    private String code;

    @NotNull
    @InstanceName
    @Column(name = "NAME", nullable = false, length = 50)
    private String name;

    @NotNull
    @JoinColumn(name = "CITY_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private City city;

    @NotNull
    @JoinColumn(name = "COUNTRY_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Country country;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}