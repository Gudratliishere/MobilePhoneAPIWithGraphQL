package com.company.mobilephoneapiwithgraphql.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Phone")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Phone implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(length = 100, name = "brand_name")
    private String brandName;
    @Column(length = 100, name = "model_name")
    private String modelName;
    @Column(length = 100, name = "imei")
    private Integer imei;
}
