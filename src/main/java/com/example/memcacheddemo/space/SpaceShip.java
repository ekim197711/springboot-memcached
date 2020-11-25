package com.example.memcacheddemo.space;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SpaceShip implements Serializable {
    private static final long serialVersionUID = 1L;
    private String model;
    private String captain;
    private Integer fuel;
}
