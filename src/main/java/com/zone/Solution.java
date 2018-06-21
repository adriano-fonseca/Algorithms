package com.zone;

import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author adriano-fonseca
 * 
 * Solution has methods relate to seasons 
 * 
 * See more about it in https://www.timeanddate.com/calendar/aboutseasons.html
 */
public class Solution {
	
	public static void main(String[] args) {
		Solution.getSeason(Month.FEBRUARY, Hemisphere.NORTH);
	}


	/**
	 * @param zone second IANA Time Zone Database
	 * @param hemisphere 
	 * @return considering the zone returns the Season
	 * 
	 * TODO: It  would be nice to refactor this method to use the zone to request
	 * the Coordinate through the Google API, if the Latitude is negative, means that
	 * the zone is from the south hemisphere, otherwise is from the north
	
	public static Season getSeason(String zone, Hemisphere hemisphere) {
		ZoneId zoneId = ZoneId.of(zone);
		ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
		Month month = Month.from(zonedDateTime);
		Season season = Season.of(month, hemisphere);
		System.out.println(season.toString());
		return season;
	} */
	
	public static Season getSeason(Month month, Hemisphere hemisphere) {
		Season season = Season.of(month, hemisphere);
		return season;
	}
	
}
