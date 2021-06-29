package ru.job4j.stream;

public class Car {
    private String madeIn;
    private String mark;
    private String model;
    private double engineVolume;
    private int enginePower;
    private int yearOfIssue;
    private int length;
    private int width;
    private int height;

    static class Builder {
        private String madeIn;
        private String mark;
        private String model;
        private double engineVolume;
        private int enginePower;
        private int yearOfIssue;
        private int length;
        private int width;
        private int height;

        Builder buildMadeIn(String madeIn) {
            this.madeIn = madeIn;
            return this;
        }

        Builder buildMark(String mark) {
            this.mark = mark;
            return this;
        }

        Builder buildModel(String model) {
            this.model = model;
            return this;
        }

        Builder buildEngineVolume(double engineVolume) {
            this.engineVolume = engineVolume;
            return this;
        }

        Builder buildEnginePower(int enginePower) {
            this.enginePower = enginePower;
            return this;
        }

        Builder buildYearOfIssue(int yearOfIssue) {
            this.yearOfIssue = yearOfIssue;
            return this;
        }

        Builder buildLength(int length) {
            this.length = length;
            return this;
        }

        Builder buildWidth(int width) {
            this.width = width;
            return this;
        }

        Builder buildHeight(int height) {
            this.height = height;
            return this;
        }

        Car build() {
            Car car = new Car();
            car.madeIn = madeIn;
            car.mark = mark;
            car.model = model;
            car.engineVolume = engineVolume;
            car.enginePower = enginePower;
            car.yearOfIssue = yearOfIssue;
            car.length = length;
            car.width = width;
            car.height = height;
            return car;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", mark='" + mark + '\'' +
                ", madeIn='" + madeIn + '\'' +
                ", engineVolume=" + engineVolume +
                ", enginePower=" + enginePower +
                ", yearOfIssue=" + yearOfIssue +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {
        Car car = new Builder().buildModel("Skoda")
                .buildMark("Octavia")
                .buildMadeIn("Czech Republic")
                .buildYearOfIssue(2018)
                .buildEngineVolume(1.6)
                .buildEnginePower(140)
                .buildLength(4689)
                .buildWidth(1829)
                .buildHeight(1485)
                .build();
        System.out.println(car);

    }
}
