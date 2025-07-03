import java.math.BigDecimal;

public class Smartphone extends Prodotto {
    private String IMEIcode;
    private int memoryCapacity;

    public Smartphone(String code, String name, String brand, BigDecimal price, BigDecimal iva, String IMEIcode,
            int memoryCapacity) {
        super(code, name, brand, price, iva);
        this.IMEIcode = IMEIcode;
        this.memoryCapacity = memoryCapacity;
    }

    public String getIMEIcode() {
        return this.IMEIcode;
    }

    public int getMemoryCapacity() {
        return this.memoryCapacity;
    }

    public void setMemoryCapacity(int memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }
}
