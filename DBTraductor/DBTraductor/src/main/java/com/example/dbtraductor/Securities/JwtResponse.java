package com.example.dbtraductor.Securities;

public class JwtResponse {

    private static final long serialVersionUID = -8091879091924046844L;
    private final String jwttoken;

    public String getJwttoken() {
        return jwttoken;
    }

    public JwtResponse(String jwttoken) {
        super();
        this.jwttoken = jwttoken;
    }

}
