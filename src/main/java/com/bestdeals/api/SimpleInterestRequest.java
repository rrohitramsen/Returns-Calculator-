package com.bestdeals.api;

import io.swagger.annotations.ApiModelProperty;


/**
 * Created by rohitkumar on 14/08/17.
 */
public class SimpleInterestRequest {

    @ApiModelProperty(notes = "Client ID", required = true)
    private int clientId;

    @ApiModelProperty(notes = "The principal investment amount (the initial deposit or loan amount)", required = true)
    private double principalAmount;

    @ApiModelProperty(notes = "the annual interest rate (decimal)", required = true)
    private float annualInterestRate;

    @ApiModelProperty(notes = "the number of years the money is invested or borrowed for", required = true)
    private int numberOfYears;

    @ApiModelProperty(notes = "Currency Type (GBP, EUR, AUD, USD) supported. By Default GBP")
    private CurrencyType currencyType = CurrencyType.GBP;

    public SimpleInterestRequest() {
    }

    public double getPrincipalAmount() {
        return principalAmount;
    }

    public void setPrincipalAmount(double principalAmount) {
        this.principalAmount = principalAmount;
    }

    public float getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(float annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public CurrencyType getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(CurrencyType currencyType) {
        this.currencyType = currencyType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SimpleInterestRequest)) return false;

        SimpleInterestRequest that = (SimpleInterestRequest) o;

        if (clientId != that.clientId) return false;
        if (Double.compare(that.principalAmount, principalAmount) != 0) return false;
        if (Float.compare(that.annualInterestRate, annualInterestRate) != 0) return false;
        return numberOfYears == that.numberOfYears;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = clientId;
        temp = Double.doubleToLongBits(principalAmount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (annualInterestRate != +0.0f ? Float.floatToIntBits(annualInterestRate) : 0);
        result = 31 * result + numberOfYears;
        return result;
    }

    @Override
    public String toString() {

        return "SimpleInterestRequest{" +
                "clientId=" + clientId +
                ", principalAmount=" + principalAmount +
                ", annualInterestRate=" + annualInterestRate +
                ", numberOfYears=" + numberOfYears +
                ", currencyType=" + currencyType +
                '}';
    }
}
