package com.bestdeals.api;

/**
 * Created by rohitkumar on 14/08/17.
 */
public enum CurrencyType {

    GBP("GBP"),
    EUR("EURO"),
    AUD("Australian Dollar"),
    USD("US Dollar");

    private String name;

    CurrencyType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
