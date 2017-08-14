package com.bestdeals.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by rohitkumar on 14/08/17.
 */

@Repository
public class DealsRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(DealsRepository.class);


    private static final Map<Integer, Double> dealsRepo;

    static {
        dealsRepo = new ConcurrentHashMap();
    }

    /**
     *
     * @param clientId
     * @param returns
     */
    public void saveDeal(int clientId, double returns) {

        LOGGER.info("Saving Client "+clientId+ "returns "+returns);

        if (dealsRepo.get(clientId) == null) {
            dealsRepo.put(clientId, returns);
        } else {
            dealsRepo.put(clientId, dealsRepo.get(clientId) + returns);
        }

    }

    /**
     *
     * @param clientId
     * @return accumulated return
     */
    public Double getDeals(int clientId) {

        return  dealsRepo.get(clientId);
    }
}
