package com.example.deliveryservice;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;


@Data
@SuppressWarnings("JpaDataSourceORMInspection")
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Entity
@Table(name = "delivery")
public class Delivery implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Date date = new Date();
    @Column
    String member;
    @Column
    String product;

    @Builder
    public Delivery(String member, String product,Date date) {
        this.date = date;
        this.member = member;
        this.product = product;

  }

}
