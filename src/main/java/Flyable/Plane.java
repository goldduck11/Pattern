package Flyable;

import java.io.File;

public abstract class Plane implements Flyable {
    private int x, y, z;
    private int speed;
    private int fuel;

    @Override
    public void increase_height(int height) {
        this.y += height;
    }

    @Override
    public void fly_to_the_point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }


    public int getSpeed() {
        return speed;
    }


    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

}
