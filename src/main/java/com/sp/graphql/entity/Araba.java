package com.sp.graphql.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Getter
@Setter
@Entity
@Table( name ="araba")
public class Araba implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 100,name="tip")
    private String arabaTip;
    @Column(length = 100,name="model_kod")
    private String modelKod;

    @Column(length = 100,name="marka_ad")
    private String markaAd;
    @Column(length = 100,name="uretim_tarih")
    private Date uretimTarihi;

}
