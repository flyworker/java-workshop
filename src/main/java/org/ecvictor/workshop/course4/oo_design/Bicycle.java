package org.ecvictor.workshop.course4.oo_design;

/**
 * Created by ccao on 2017-08-20.
 */
public class Bicycle {

    private String color;
    private String manufacture;
    private String createdDate;
    private Distance distance;
    private String brandName;

    public Bicycle() {
        Distance distance = new Distance();
        distance.setQuantity(0);
        distance.setUnit(Unit.KM);
        this.distance = distance;
    }

    public Distance getDistance() {
        return distance;
    }

    public void setDistance(Distance distance) {
        this.distance = distance;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void addDrivingDistance(Distance travelingDistance) {
        if (travelingDistance.getUnit().equals(this.distance.getUnit())) {
            int currentDistance = this.distance.getQuantity();
            currentDistance += travelingDistance.getQuantity();
            this.distance.setQuantity(currentDistance);
        }
        //mile to km
        if (travelingDistance.getUnit().equals(Unit.MILE)){
            int currentDistance = this.distance.getQuantity();
            currentDistance += travelingDistance.getQuantity()* Unit.MILE_TO_KM;
            this.distance.setQuantity(currentDistance);
        }

    }

    public boolean isRetired() {
        return this.distance.getQuantity() >= 2000;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "color='" + color + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", distance=" + distance +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}
