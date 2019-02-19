package java18.demo4_Builder;

public class CarBuilder {

    private Car car;

    public CarBuilder() {
        car = new Car();
    }

    public Car build() {
        return car;
    }

    public CarBuilder setColor(final String color) {
        car.setColor(color);
        if (color.equals("black")) car.setWheels(2);
        return this;
    }
    public CarBuilder setWheels(final int wheels) {
        car.setWheels(wheels);
        return this;
    }
}
