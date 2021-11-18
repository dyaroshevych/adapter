package db;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataBaseTest {
    БазаДаних deprecated_db;
    Database db;

    @BeforeEach
    void setUp() {
        deprecated_db = new БазаДаних();
        db = new Database();
    }

    @Test
    void getUserData() {
        assertEquals(deprecated_db.отриматиДаніКористувача(), db.getUserData());
    }

    @Test
    void getStatisticData() {
        assertEquals(deprecated_db.отриматиСтатистичніДані(), db.getStaticData());
    }
}