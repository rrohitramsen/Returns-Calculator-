package com.bestdeals.api;

import com.bestdeals.service.DealService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by rohitkumar on 14/08/17.
 */
@RestController
@RequestMapping("/bestDeals")
@Api(value="BestDeals Bank ", description="BestDeals Bank wants Returns calculator API")
public class DealsAPI {

    @Autowired
    DealService dealService;

    @ApiOperation(value = "Simple Interest Deal", response = String.class)
    @RequestMapping(value = "/deals/simpleInterest", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.ALL_VALUE)
    public ResponseEntity<String> makeSimpleInterestDeal(@RequestBody SimpleInterestRequest simpleInterestRequest){

        dealService.makeDeal(simpleInterestRequest);
        return new ResponseEntity<String>("Simple Interest Deal completed Successfully", HttpStatus.OK);
    }

    @ApiOperation(value = "Compound Interest Deal", response = String.class)
    @RequestMapping(value = "/deals/compoundInterest", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.ALL_VALUE)
    public ResponseEntity<String> makeCompoundInterestDeal(@RequestBody CompoundInterestRequest compoundInterestRequest){

        dealService.makeDeal(compoundInterestRequest);
        return new ResponseEntity<String>("Compound Interest Deal completed Successfully", HttpStatus.OK);
    }

    @ApiOperation(value = "Accumulate client returns in dollars across all its deals",response = AccumulateClientReturns.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
    @RequestMapping(value = "/deals/{clientId}", method= RequestMethod.GET, produces = "application/json")
    public AccumulateClientReturns showProduct(@PathVariable Integer clientId, Model model){

        AccumulateClientReturns accumulateClientReturns = dealService.getClientReturns(clientId);
        return accumulateClientReturns;
    }

}
