package web.model;

public class Car {
    private String brandName;
    private String model;
    private int power;

    public Car() {
    }

    public Car(String brandName, String model, int power) {
        this.brandName = brandName;
        this.model = model;
        this.power = power;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\'' +
                ", model='" + model + '\'' +
                ", power='" + power + '\'' +
                '}';
    }
}
