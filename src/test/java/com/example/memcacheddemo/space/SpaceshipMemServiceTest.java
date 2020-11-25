package com.example.memcacheddemo.space;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpaceshipMemServiceTest {

    @Autowired
    SpaceshipMemService spaceshipMemService;

    @Test
    public void storeKeySpaceShip() throws IOException {
        String key = "myship2";
        spaceshipMemService.storeKeySpaceShip(key, new SpaceShip("Pyramid", "Mike", 55));
        SpaceShip spaceShip = spaceshipMemService.getSpaceShip(key);
        System.out.println("SpaceShip: " + spaceShip);
    }
}