package decoratorPattern.beverage;

public abstract class Beverage {
    public enum Size { TALL, GRANDE, VENTI };
    Size size = Size.TALL;
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();
}
