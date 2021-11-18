package auth;

import db.Database;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AuthorizationTest {
    Авторизація deprecated_auth;
    Authorization auth;
    Database db;

    @BeforeEach
    void setUp() {
        deprecated_auth = new Авторизація();
        auth = new Authorization();
        db = new Database();
    }

    @Test
    void authorise() {
        assertEquals(auth.authorize(db), deprecated_auth.авторизуватися(db));
    }
}