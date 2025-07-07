import java.math.BigDecimal;

public class Prodotto {
    protected String code;
    protected String name;
    protected String brand;
    protected BigDecimal price;
    protected BigDecimal iva;

    public Prodotto(String code, String name, String brand, BigDecimal price, BigDecimal iva) {
        this.code = code;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.iva = iva;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        if (brand != null) {
            this.brand = brand;
        }
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        if (price.compareTo(BigDecimal.ZERO) > 0) {
            this.price = price;
        }
    }

    public BigDecimal getIva() {
        return this.iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public BigDecimal calculatePriceIva() {
        BigDecimal calcIva = BigDecimal.ZERO;

        if (this.price.compareTo(BigDecimal.ZERO) > 0) {
            calcIva = this.price.multiply(this.iva).divide(new BigDecimal(100));
        }

        return this.price.add(calcIva);
    }

    @Override
    public String toString() {
        return String.format("Code: '%s'\nName: '%s'\nBrand: '%s'\nPrice: '%s'\nIva: '%s'\n", this.code, this.name,
                this.brand, this.price, this.iva);
    }
}
