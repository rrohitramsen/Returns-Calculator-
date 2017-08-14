package com.bestdeals.api;


/**
 * Created by rohitkumar on 14/08/17.
 */
public class AccumulateClientReturns {

    private int clientId;

    private Double accumulatedClientReturns;

    private String message;

    public AccumulateClientReturns(int clientId, Double accumulatedClientReturns, String message) {
        this.clientId = clientId;
        this.accumulatedClientReturns = accumulatedClientReturns;
        this.message = message;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public Double getAccumulatedClientReturns() {
        return accumulatedClientReturns;
    }

    public void setAccumulatedClientReturns(Double accumulatedClientReturns) {
        this.accumulatedClientReturns = accumulatedClientReturns;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
