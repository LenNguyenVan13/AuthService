package com.example.authservice.service;

import com.example.authservice.entity.Token;
import com.example.authservice.service.TokenService;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);

}
