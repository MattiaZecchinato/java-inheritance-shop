import java.math.BigDecimal;

public class Televisori extends Prodotto {
    private double width;
    private double height;
    private double depth;
    private boolean isSmart;

    double minWidth = 60;
    double maxWidth = 300;
    double minHeight = 30;
    double maxHeight = 130;
    double minDepth = 10;
    double maxDepth = 30;

    public Televisori(String code, String name, String brand, BigDecimal price, BigDecimal iva, double width,
            double height, double depth, boolean isSmart) {
        super(code, name, brand, price, iva);
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.isSmart = isSmart;
    }

    public String printMeasurements() {
        return String.format(
                "The television '%s' measures: %.2fcm in width, %.2fcm in height, %.2fcm in depth",
                this.name, this.width, this.height, this.depth);
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        if (width > minWidth && width < maxWidth) {
            this.width = width;
        }
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        if (height > minHeight && height < maxHeight) {
            this.height = height;
        }
    }

    public double getDepth() {
        return this.depth;
    }

    public void setDepth(double depth) {
        if (depth > minDepth && depth < maxDepth) {
            this.depth = depth;
        }
    }

    public Boolean getIsSmart() {
        return this.isSmart;
    }
}
