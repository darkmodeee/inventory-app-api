package com.darkmode.inventory_app.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Media extends BaseEntity {
    private float parStock;
    private float reOrderLevel;
    private String thickness;
    @ManyToOne
    private Core core;
    @ManyToOne
    private Color color;
    @ManyToOne
    private Dimension dimension;
    @ManyToOne
    private CommonName commonName;
    @ManyToOne
    private Brand brand;
    @ManyToOne
    private Type type;
    @ManyToOne
    private UnitOfMeasure unitOfMeasure;
    @ManyToOne
    private Unit unit;
}
