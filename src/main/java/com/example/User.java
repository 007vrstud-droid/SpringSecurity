package com.example;

public record User(
        String username,
        String password,
        String role
) {
}