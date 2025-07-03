import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // smartphone
        Smartphone iphone16 = new Smartphone("12345", "Iphone 16", "Iphone", new BigDecimal(1199), new BigDecimal(20),
                "12345678", 16);

        System.out.println(iphone16.getIMEIcode());

        // televisori
        Televisori samsungBC11 = new Televisori("12322", "Samsung BC11", "Samsung", new BigDecimal(499),
                new BigDecimal(20), 100, 50, 20, false);

        System.out.println(samsungBC11.printMeasurements());

        // cuffie
        Cuffie beats110a = new Cuffie("54636", "Beats 110a", "Beats", new BigDecimal(230), new BigDecimal(20), "white",
                true);

        System.out.println(beats110a.calculatePriceIva());
    }
}
