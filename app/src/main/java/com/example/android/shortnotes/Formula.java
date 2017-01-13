package com.example.android.shortnotes;

/**
 * Created by rolin on 1/12/2017.
 */

public class Formula {
    private String integral;
    private String defaultFormula;
    private String derivative;

    public Formula(String integral, String defaultFormula, String derivative){
        this.integral = integral;
        this.defaultFormula = defaultFormula;
        this.derivative = derivative;
    }

    public String getDefaultFormula() {
        return defaultFormula;
    }

    public String getIntegral() {
        return integral;
    }

    public String getDerivative() {
        return derivative;
    }
}
