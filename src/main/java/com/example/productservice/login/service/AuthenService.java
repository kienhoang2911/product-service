package com.example.productservice.login.service;


import com.example.productservice.login.domain.dto.JwtRequest;
import com.example.productservice.login.domain.dto.JwtResponse;
import com.example.productservice.login.domain.dto.RefreshTokenPayloadDto;
import com.example.productservice.login.domain.dto.UserDto;

public interface AuthenService {

    UserDto login(JwtRequest request);

//    UserDto register(JwtRequest request);
//
    JwtResponse refreshToken(RefreshTokenPayloadDto payload);
}
