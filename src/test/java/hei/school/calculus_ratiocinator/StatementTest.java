package hei.school.calculus_ratiocinator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StatementTest {

    @Test
    void testFalse() {
        Statement statement1 = new Statement("Lou est beau", "FALSE");
        Statement statement2 = new Statement("Lou est pauvre", "FALSE");
        assertEquals("FALSE", Statement.IsFalseOrTrueUsingThusOr(statement1, statement2));
    }

    @Test
    void testTrue(){
        Statement statement3 = new Statement("Lou est généreux", "TRUE");
        Statement statement4 = new Statement("Lou est beau", "TRUE");
        assertEquals("TRUE", Statement.IsFalseOrTrueUsingThusOr(statement3, statement4));
    }

    @Test
    void testTrueAndFalse(){
        Statement statement5 = new Statement("Lou est généreux", "TRUE");
        Statement statement6 = new Statement("Lou est pauvre", "FALSE");
        assertEquals("TRUE", Statement.IsFalseOrTrueUsingThusOr(statement5, statement6));
    }

    @Test
    void testFalseAndTrue(){
        Statement statement7 = new Statement("Lou est généreux", "TRUE");
        Statement statement8 = new Statement("Lou est pauvre", "FALSE");
        assertEquals("FALSE", Statement.IsFalseOrTrueUsingAnd(statement7, statement8));
    }
}
