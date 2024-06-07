package hei.school.calculus_ratiocinator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StatementTest {

    @Test
    void testFalse() {
        Statement statement1 = new Statement("Lou est beau", "FALSE");
        Statement statement2 = new Statement("Lou est pauvre", "FALSE");
        assertEquals("FALSE", Statement.IsFalseOrTrue(statement1, statement2));
    }

    @Test
    void testTrue(){
        Statement statement3 = new Statement("Lou est généreux", "TRUE");
        Statement statement4 = new Statement("Lou est beau", "TRUE");
        assertEquals("TRUE", Statement.IsFalseOrTrue(statement3, statement4));
    }
}
