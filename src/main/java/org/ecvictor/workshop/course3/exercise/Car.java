package org.ecvictor.workshop.course3.exercise;

/**
 * Created by ccao on 2017-08-20.
 */
public class Car {
    private String color;
    private String type;
    private String manufacture;
    private String createdDate;
    private int distance;
    private String brandName;

    public Car() {
        this.distance = 0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int addDrivingDistance(int travelingDistance) {
        this.distance += travelingDistance;
        return this.distance;
    }

    public boolean isRetired() {
        return this.distance >= 200000 ;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", distance=" + distance +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}
