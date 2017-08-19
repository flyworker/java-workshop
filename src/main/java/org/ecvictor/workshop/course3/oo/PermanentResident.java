package org.ecvictor.workshop.course3.oo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ccao on 2017-08-19.
 */
public class PermanentResident {

    private String id;
    private String eyeColor;

    //0 for male, 1 for female
    private int gender;

    private String name;
    private String birthDate;




    private String nation;
    private int visaType;

    public PermanentResident() {
    }

    public PermanentResident(String nameInt) {
        name = nameInt;
    }

    public PermanentResident(String nameInt, int genderInt, String birthDateInt) {
        name = nameInt;
        gender = genderInt;
        birthDate = birthDateInt;
    }


    public boolean isChinese() {
        return nation.equals("Chinese");
    }

    public String getName() {
        return name;
    }

    public void setNation(String nation) {
        List<String> countryBlackList = new ArrayList<String>();
        countryBlackList.add("Canadian");

        if (nation.equals("")) {
           return;
        }

        for (String country : countryBlackList) {
            if (nation.equals(country))
                return;
        }

        this.nation = nation;
    }


    public String getNation() {
        return nation;
    }
}
