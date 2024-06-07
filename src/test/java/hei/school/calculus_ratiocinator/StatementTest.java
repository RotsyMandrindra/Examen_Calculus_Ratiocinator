package hei.school.calculus_ratiocinator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StatementTest {

    @Test
    void testFalse() {
        Statement statement1 = new Statement("Lou est pauvre", "FALSE");
        Statement statement2 = new Statement("Lou est généreux", "TRUE");
        assertEquals("FALSE", Statement.IsFalseOrTrueUsingAnd(statement1, statement2));
    }
    @Test
    void testFalseAndTrue(){
        Statement statement3 = new Statement("Lou est beau", "TRUE");
        Statement statement4 = new Statement("Lou est pauvre", "FALSE");
        assertEquals("FALSE", Statement.IsFalseOrTrueUsingThus(statement3, statement4));
    }

    @Test
    void testTrueFalse(){
        Statement statement5 = new Statement("Lou est pauvre", "FALSE");
        Statement statement6 = new Statement("Lou est généreux", "TRUE");
        assertEquals("TRUE", Statement.IsFalseOrTrueUsingThus(statement5, statement6));
    }

    @Test
    void testTrueTrueFalse(){
        Statement statement7 = new Statement("Lou est beau ou Lou est généreux", "TRUE");
        Statement statement8 = new Statement("Lou est pauvre", "FALSE");
        assertEquals("FALSE", Statement.IsFalseOrTrueUsingThus(statement7, statement8));
    }

    @Test
    void testTrueTrue(){
        Statement statement9 = new Statement("Lou est pauvre", "FALSE");
        Statement statement10 = new Statement("Lou est généreux", "TRUE");
        assertEquals("TRUE", Statement.IsFalseOrTrueUsingOr(statement9, statement10));
    }
}
