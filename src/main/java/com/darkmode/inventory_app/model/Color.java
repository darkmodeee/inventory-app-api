package com.darkmode.inventory_app.model;

import lombok.*;

import javax.persistence.Entity;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Color extends BaseEntity {
    private String value;
}
