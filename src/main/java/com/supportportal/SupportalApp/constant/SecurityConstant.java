package com.supportportal.SupportalApp.constant;

public class SecurityConstant {
    public static final Long EXPIRATION_TIME = 432000000L;//5 Days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String JWT_TAKEN_HEADER ="Jwt-Token";
    public static final String TOKEN_CANNOT_BE_VERIFIED = "Token cannot be verified";
    public static final String GET_ARRAYS_LLC = "GetArrays, LLC";
    public static final String GET_ARRAYS_ADMINISTRATION = "User Management Portal";
    public static final String AUTHORITIES_KEY = "Authorities";
    public static final String FORBIDDEN_MESSAGE = "You need to log in to access this page";
    public static final String ACCESS_DENIED_MESSAGE = "Access Denied";
    public static final String OPTIONS_HTTP_METHOD = "OPTIONS";
    public static final String[] PUBLIC_URLS = {"/user/login", "/user/register", "/user/resetPassword/**", "/user/image/**"};



}
