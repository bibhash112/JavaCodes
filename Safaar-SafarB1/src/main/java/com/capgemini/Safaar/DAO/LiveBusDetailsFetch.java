package com.capgemini.Safaar.DAO;


import java.util.ArrayList;
import java.util.List;
//import java.nio.file.Files;
//import java.nio.file.Paths;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.capgemini.Safaar.DTO.BusDetails;

public class LiveBusDetailsFetch {
	
	
	public static JSONObject getBuses(String source, String destination, String date)  {
		try
		{
		JSONObject busObject=LiveDataFetch.readJsonFromUrl("https://developer.goibibo.com/api/bus/search/?app_id=01b99a4d&app_key=612355f5b3fbdc8ea1011f133c392791&format=json&source="+source+"&destination="+destination+"&dateofdeparture="+date+"");
		//String contents = new String(Files.readAllBytes(Paths.get("bus.json")));
		//JSONObject busObject = new JSONObject(contents);
		System.out.println("DATA RECIEVED SUCCESSFULLY");
		return busObject;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	public List<BusDetails> getListOfBuses(String source,String destination,String date) throws JSONException
	{
		List<BusDetails> busSearchResults=new ArrayList<>();
		JSONObject bus=getBuses(source, destination, date);
		JSONArray onewayBusArray=bus.getJSONObject("data").getJSONArray("onwardflights");
		for(int i=0;i<onewayBusArray.length();i++)
		{
			String departureDetails=onewayBusArray.getJSONObject(i).getString("depdate");
			String departureTime=departureDetails.substring(11, 19);
			String travelsName=onewayBusArray
					.getJSONObject(i)
					.getString("TravelsName");
			String busType=onewayBusArray
					.getJSONObject(i)
					.getString("BusType");
			String duration=onewayBusArray
					.getJSONObject(i)
					.getString("duration");
			String rating=onewayBusArray
					.getJSONObject(i)
					.getString("rating");
			String fare=onewayBusArray
					.getJSONObject(i)
					.getJSONObject("fare")
					.getString("totalfare");
			rating=(rating.equals("0"))?"Rating not available":rating;
			busSearchResults
			.add(new BusDetails(source, destination, date, departureTime, busType, travelsName, duration, rating, fare));
		}
		return busSearchResults;
	
	}
	

}
