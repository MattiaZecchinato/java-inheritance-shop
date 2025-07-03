import java.math.BigDecimal;

public class Cuffie extends Prodotto {
    private String colour;
    private boolean isWireless;

    public Cuffie(String code, String name, String brand, BigDecimal price, BigDecimal iva, String colour,
            boolean isWireless) {
        super(code, name, brand, price, iva);
        this.colour = colour;
        this.isWireless = isWireless;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean getIsWireless() {
        return this.isWireless;
    }
}