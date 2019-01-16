import java.util.TreeMap;

public class NumerosRomanos {

    private int numero;
    private static final TreeMap<Integer, String> romanosNumeral = new TreeMap<>();

    public NumerosRomanos(int numero) {
        this.numero = numero;
        popularRomanosNumeral();
    }

    private void popularRomanosNumeral() {
        romanosNumeral.put(1000, "M");
        romanosNumeral.put(900, "CM");
        romanosNumeral.put(500, "D");
        romanosNumeral.put(400, "CD");
        romanosNumeral.put(100, "C");
        romanosNumeral.put(90, "XC");
        romanosNumeral.put(50, "L");
        romanosNumeral.put(40, "XL");
        romanosNumeral.put(10, "X");
        romanosNumeral.put(9, "IX");
        romanosNumeral.put(5, "V");
        romanosNumeral.put(4, "IV");
        romanosNumeral.put(1, "I");
    }


    private String converter(int numeral) {

        int numeralReferencia =  romanosNumeral.floorKey(numeral);
        if ( numeral == numeralReferencia ) {
            return romanosNumeral.get(numeral);
        }
        return romanosNumeral.get(numeralReferencia) +
                converter(numeral- numeralReferencia);
    }

    @Override
    public String toString() {
        return converter(this.numero);
    }
}
