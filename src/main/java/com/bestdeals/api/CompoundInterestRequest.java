package com.bestdeals.api;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by rohitkumar on 14/08/17.
 */
public class CompoundInterestRequest extends SimpleInterestRequest {

    @ApiModelProperty(notes = "the number of times that interest is compounded per year", required = true)
    private int interestCompoundPerYear;

    public CompoundInterestRequest() {
    }

    public int getInterestCompoundPerYear() {
        return interestCompoundPerYear;
    }

    public void setInterestCompoundPerYear(int interestCompoundPerYear) {
        this.interestCompoundPerYear = interestCompoundPerYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CompoundInterestRequest)) return false;
        if (!super.equals(o)) return false;

        CompoundInterestRequest that = (CompoundInterestRequest) o;

        return interestCompoundPerYear == that.interestCompoundPerYear;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + interestCompoundPerYear;
        return result;
    }

    @Override
    public String toString() {

        return "CompoundInterestRequest{" +
                "clientId=" + getClientId() +
                ", principalAmount=" + getPrincipalAmount() +
                ", annualInterestRate=" + getAnnualInterestRate() +
                ", numberOfYears=" + getNumberOfYears() +
                ", currencyType=" + getCurrencyType() +
                "interestCompoundPerYear=" + interestCompoundPerYear +
                '}';
    }
}
