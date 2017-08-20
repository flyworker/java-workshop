package org.ecvictor.workshop.course4.oo_design;


/**
 * Created by ccao on 2017-08-20.
 */
public class TandemBicycle extends Bicycle {
    private boolean multiSeat = true;


    public boolean isRetired() {
        return this.getDistance().getQuantity() >= 200;
    }

    @Override
    public String toString() {
        return super.toString() +
                "TandemBicycle{" +
                "multiSeat=" + multiSeat +
                '}';
    }
}
