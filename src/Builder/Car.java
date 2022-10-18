package Builder;

public class Car {
    private final String model;
    private final String description;
    private final String fuelType;
    private final int speed;
    private final Color color;

    public Car(String model, String description, String fuelType, int speed, Color color) {
        this.model = model;
        this.description = description;
        this.fuelType = fuelType;
        this.speed = speed;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", description='" + description + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", speed=" + speed +
                ", color=" + color +
                '}';
    }
}
