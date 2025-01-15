
package taller7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {

    @Test
    void testValidFormula() {
        String result = Operations.Solve("34-80+1");
        assertEquals("34-80+1=-45", result, "La fórmula no se resolvió correctamente.");
    }

    @Test
    void testWithInvalidFormula() {
        Exception exception = assertThrows(NumberFormatException.class, () -> Operations.Solve("3++5"));
        assertTrue(exception.getMessage().contains("For input string"), "No se lanzó la excepción esperada para fórmula inválida.");
    }

    @Test
    void testWithNullFormula() {
        String formula = null;
        assertThrows(NullPointerException.class, () -> { Operations.Solve(formula); }, "La función Solve no debería ser null."); 
    }

    @Test
    void testWithOrderOfOperations() {
    String result = Operations.Solve("2+3*4");
    assertEquals("2+3*4=14", result, "El cálculo no se ejecutó de forma correcta");
    }

    @Test
    void testWithDivisionByZero() {
    Exception exception = assertThrows(ArithmeticException.class, () -> Operations.Solve("8/0"));
    assertTrue(exception.getMessage().contains("/ by zero"), "No se lanzó la excepción esperada al dividir por cero.");
    }


}
