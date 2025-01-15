
package taller7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {

    @Test
    void testValidFormula() {
        String result = Operations.Solve("34-80+1");
        assertEquals("34-80+1=-45", result, "La fórmula no se resolvió correctamente.");
    }
}
