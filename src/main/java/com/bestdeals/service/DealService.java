package com.bestdeals.service;

import com.bestdeals.api.AccumulateClientReturns;
import com.bestdeals.api.CompoundInterestRequest;
import com.bestdeals.api.SimpleInterestRequest;
import org.springframework.stereotype.Service;

/**
 * Created by rohitkumar on 14/08/17.
 */
@Service
public interface DealService {

    /**
     * make simple interest deal
     * @param simpleInterestRequest
     */
    void makeDeal(SimpleInterestRequest simpleInterestRequest);

    /**
     * make compound interest deal
     * @param compoundInterestRequest
     */
    void makeDeal(CompoundInterestRequest compoundInterestRequest);

    /**
     *
     * @param clientId
     * @return AccumulateClientReturns
     */
    AccumulateClientReturns getClientReturns(Integer clientId);
}
