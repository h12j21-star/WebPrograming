package com.example.deliveryservice;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member implements Serializable {

    private long id;
    private String name;
    private String password;
}