import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void calcularDescuento() {

        final Double valorEsperado = 2000.00;
        final Double actual = Main.calcularTotalProducto(8, 10000.00);

        assertEquals(valorEsperado, actual);

    }
}
