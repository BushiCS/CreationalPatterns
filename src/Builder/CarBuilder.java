package Builder;

public class CarBuilder {

    private String model;
    private String description;
    private String fuelType;
    private int speed;
    private Color color;

    public CarBuilder model(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder description(String description) {
        this.description = description;
        return this;
    }

    public CarBuilder fuelType(String fuelType) {
        this.fuelType = fuelType;
        return this;
    }

    public CarBuilder speed(int speed) {
        this.speed = speed;
        return this;
    }

    public CarBuilder colour(Color colour) {
        this.color = colour;
        return this;
    }

    public Car build() {
        return new Car(model, description, fuelType, speed, color);
    }
}
