package org.ecvictor.workshop.course4.oo_design;

/**
 * Created by ccao on 2017-08-20.
 */
public class Distance {
    private int quantity;
    private String unit;


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }



    @Override
    public String toString() {
        return "Distance{" +
                "quantity=" + quantity +
                ", unit='" + unit + '\'' +
                '}';
    }
}
