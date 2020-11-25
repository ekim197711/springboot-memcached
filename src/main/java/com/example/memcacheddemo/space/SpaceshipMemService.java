package com.example.memcacheddemo.space;

import lombok.extern.slf4j.Slf4j;
import net.spy.memcached.MemcachedClient;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.InetSocketAddress;

@Service
@Slf4j
public class SpaceshipMemService {

    public void storeKeySpaceShip(String key, SpaceShip value) throws IOException {
        MemcachedClient mcc = new MemcachedClient(new
                InetSocketAddress("127.0.0.1", 11211));
        log.info("Connection to server sucessfully");
        boolean done = mcc.set(key, 900, value).isDone();
        log.info("Is done:" + done);
    }

    public SpaceShip getSpaceShip(String key) throws IOException {
        MemcachedClient mcc = new MemcachedClient(new
                InetSocketAddress("127.0.0.1", 11211));
        return (SpaceShip)mcc.get(key);
    }
}
