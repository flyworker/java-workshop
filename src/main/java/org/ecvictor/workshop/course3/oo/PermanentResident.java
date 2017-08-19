package org.ecvictor.workshop.course3.oo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ccao on 2017-08-19.
 */
public class PermanentResident {
    public static final String VISA_TYPE = "Permanent Resident";

    public static int miniteInDay() {
        return 24 * 60 * 60;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getVisaType() {
        return visaType;
    }

    public void setVisaType(int visaType) {
        this.visaType = visaType;
    }

    private String id;


    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    private String eyeColor;

    //0 for male, 1 for female
    private int gender;

    private String name;
    private String birthDate;


    private String nation;
    private int visaType;


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
