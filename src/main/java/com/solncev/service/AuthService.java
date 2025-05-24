package com.solncev.service;

import com.solncev.dto.JwtRequest;
import com.solncev.dto.JwtResponse;
import jakarta.security.auth.message.AuthException;

public interface AuthService {
    JwtResponse login(JwtRequest request);
    JwtResponse token(String token) throws AuthException;
    JwtResponse refresh(String token) throws AuthException;
}
