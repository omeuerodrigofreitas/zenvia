import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class NumerosRomanosTest {

    @Test
    public void testNumero1() {
        verificarAssert(1, "I");
    }

    @Test
    public void testNumero3() {
        verificarAssert(3, "III");
    }

    @Test
    public void testNumero4() {
        verificarAssert(4, "IV");
    }

    @Test
    public void testNumero5() {
        verificarAssert(5, "V");
    }

    @Test
    public void testNumero6() {
        verificarAssert(6, "VI");
    }

    @Test
    public void testNumero9() {
        verificarAssert(9, "IX");
    }

    private void verificarAssert(int numero, String numeroEmRomanos) {
        final NumerosRomanos numeroRomano = new NumerosRomanos(numero);
        assertThat(numero + " deveria ser " + numeroEmRomanos, numeroRomano.toString(), equalTo(numeroEmRomanos));
    }




}
