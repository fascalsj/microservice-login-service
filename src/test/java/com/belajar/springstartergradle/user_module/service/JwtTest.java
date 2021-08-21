package com.belajar.springstartergradle.user_module.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@SpringBootTest
public class JwtTest {

    @Test
    public void test() {
        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJyb2xlIjoicm9sZSIsInVzZXJuYW1lIjoidXNlcm5hbWUifQ.Kq1NYEgVM7DlW-2V0O2NFAceZAKd2W6fw8MLBfYPQa_f3UblMDvBMQv1Cz_fA_AKapm2JpWYWQKxqhUlAPNMxQ";
        try {
            Algorithm algorithm = Algorithm.HMAC512("secret");
            Calendar cal = Calendar.getInstance();
// remove next line if you're always using the current time.
            Date currentDate = new Date(System.currentTimeMillis() - TimeUnit.HOURS.toMillis(1));



            String jwtString = JWT.create()
                    .withClaim("username","username")
                    .withClaim("role", "role")
                    .withExpiresAt(currentDate)
                    .sign(algorithm);
            String jwts = null;
//            JWTVerifier verifier = JWT.require(algorithm)
//                    .withIssuer("auth0")
//                    .build(); //Reusable verifier instance
//            DecodedJWT jwt = verifier.verify(token);
        } catch (JWTVerificationException exception) {
            //Invalid signature/claims
        }

    }

}
