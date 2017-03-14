/**
 * Created by user on 3/14/2017.
 */
public class Car {

    private String make;
    private float capacity;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
