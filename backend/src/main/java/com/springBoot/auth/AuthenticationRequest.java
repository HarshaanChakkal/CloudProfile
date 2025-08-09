package com.springBoot.auth;

public record AuthenticationRequest(
        String username,
        String password
) {
}
