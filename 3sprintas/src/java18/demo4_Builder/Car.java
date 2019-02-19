package java18.demo4_Builder;

public class Car {

    private int wheels;

    private String color;

    Car() {}

    public static CarBuilder builder() {
        return new CarBuilder();
    }

    public String getColor() {
        return color;
    }

    void setColor(final String color) {
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    void setWheels(final int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", color='" + color + '\'' +
                '}';
    }
}
