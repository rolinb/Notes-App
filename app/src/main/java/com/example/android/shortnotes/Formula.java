package com.example.android.shortnotes;

/**
 * Created by rolin on 1/12/2017.
 */

public class Formula {
    private String integral = null;
    private String defaultFormula= null;
    private int imageOne = -1;
    private int imageTwo = -1;

    public Formula(String integral, String defaultFormula){
        this.integral = integral;
        this.defaultFormula = defaultFormula;
    }

    public Formula(int itemOne, int itemTwo){
        imageOne = itemOne;
        imageTwo = itemTwo;
    }

    public String getDefaultFormula() {
        return defaultFormula;
    }

    public String getIntegral() {
        return integral;
    }

    public int getImageOne(){
        return imageOne;
    }

    public int getImageTwo(){
        return imageTwo;
    }

    public boolean hasImages(){
        return (imageOne != -1);
    }

}
