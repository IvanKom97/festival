package com.example.artists;

import org.springframework.boot.SpringApplication;

public class TestArtistsApplication {

    public static void main(String[] args) {
        SpringApplication.from(ArtistsApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
