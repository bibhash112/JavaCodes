package com.capgemini.Safaar.controller;
import java.util.List;

import org.json.JSONException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.Safaar.DAO.LiveBusDetailsFetch;
import com.capgemini.Safaar.DTO.BusDetails;
@RestController
public class BusController {
	@RequestMapping(value="/home",method = RequestMethod.GET)
    public List<BusDetails> hello() throws JSONException {
		return new LiveBusDetailsFetch().getListOfBuses("kolkata", "siliguri", "20181010");
    }
}