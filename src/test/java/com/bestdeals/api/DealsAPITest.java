package com.bestdeals.api;

import com.bestdeals.service.DealServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by rohitkumar on 14/08/17.
 */
@RunWith(SpringRunner.class)
public class DealsAPITest {

    @InjectMocks
    private DealsAPI dealsAPI;

    private MockMvc mockMvc;

    @Before
    public void setup() {

        MockitoAnnotations.initMocks(this);
        DealServiceImpl dealService = Mockito.mock(DealServiceImpl.class);
        Field field = ReflectionUtils.findField(DealsAPI.class, "dealService");
        ReflectionUtils.makeAccessible(field);
        ReflectionUtils.setField(field, dealsAPI, dealService);
        this.mockMvc = MockMvcBuilders.standaloneSetup(dealsAPI).build();

    }

    @Test
    public void testMakeSimpleInterestDeal() throws Exception {

        this.mockMvc.perform(post("/bestDeals/deals/simpleInterest")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content("{" +
                        "  \"annualInterestRate\": 0," +
                        "  \"clientId\": 1," +
                        "  \"currencyType\": \"GBP\"," +
                        "  \"numberOfYears\": 0," +
                        "  \"principalAmount\": 0" +
                        "}"))
                .andExpect(status().is2xxSuccessful());
    }

    @Test
    public void testMakeCompoundInterestDeal() throws Exception {

        this.mockMvc.perform(post("/bestDeals/deals/compoundInterest")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content("{" +
                        "  \"annualInterestRate\": 0," +
                        "  \"clientId\": 1," +
                        "  \"currencyType\": \"GBP\"," +
                        "  \"interestCompoundPerYear\": 0," +
                        "  \"numberOfYears\": 0," +
                        "  \"principalAmount\": 0" +
                        "}"))
                .andExpect(status().is2xxSuccessful());
    }

    @Test
    public void testShowProduct() throws Exception {

        this.mockMvc.perform(get("/bestDeals//deals/{clientId}", 1))
                .andExpect(status().is2xxSuccessful());

    }
}
