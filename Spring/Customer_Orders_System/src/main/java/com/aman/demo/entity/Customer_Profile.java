package com.aman.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "customer_profile1")
public class Customer_Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String phone;
    private String address;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}