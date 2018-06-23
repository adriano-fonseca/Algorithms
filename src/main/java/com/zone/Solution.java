package com.zone;

import java.time.Month;

/**
 * @author adriano-fonseca
 * 
 *         Solution has methods relate to seasons
 * 
 *         See more about it in
 *         https://www.timeanddate.com/calendar/aboutseasons.html
 */
public class Solution {

	public static void main(String[] args) {
		Solution.getSeason(Month.FEBRUARY, Hemisphere.NORTH);
	}

	/**
	 * @param zone
	 *            second IANA Time Zone Database
	 * @param hemisphere
	 * @return considering the zone returns the Season
	 * 
	 *         TODO: It would be nice to refactor this method to use the zone to
	 *         request the Coordinate through the Google API, if the Latitude is
	 *         negative, means that the zone is from the south hemisphere, otherwise
	 *         is from the north
	 * 
	 *         public static Season getSeason(String zone, Hemisphere hemisphere) {
	 *         ZoneId zoneId = ZoneId.of(zone); ZonedDateTime zonedDateTime =
	 *         ZonedDateTime.now(zoneId); Month month = Month.from(zonedDateTime);
	 *         Season season = Season.of(month, hemisphere);
	 *         System.out.println(season.toString()); return season; }
	 */

	public static Season getSeason(Month month, Hemisphere hemisphere) {
		Season season = Season.of(month, hemisphere);
		return season;
	}

	public enum Season {
		SPRING, SUMMER, FALL, WINTER;

		static public Season of(Month month, Hemisphere hemisphere) {
			switch (month) {

			case JANUARY:
				if (Hemisphere.SOUTH.equals(hemisphere)) {
					return Season.SUMMER;
				}
				return Season.WINTER;

			case FEBRUARY:
				if (Hemisphere.SOUTH.equals(hemisphere)) {
					return Season.SUMMER;
				}
				return Season.WINTER;

			// Spring in the north
			// Fall in the South
			case MARCH:
				if (Hemisphere.SOUTH.equals(hemisphere)) {
					return Season.FALL;
				}
				return Season.SPRING;

			case APRIL:
				if (Hemisphere.SOUTH.equals(hemisphere)) {
					return Season.FALL;
				}
				return Season.SPRING;

			// Winter in the south
			// Summer in the north
			case MAY:
				if (Hemisphere.SOUTH.equals(hemisphere)) {
					return Season.WINTER;
				}
				return Season.SUMMER;

			case JUNE:
				if (Hemisphere.SOUTH.equals(hemisphere)) {
					return Season.WINTER;
				}
				return Season.SUMMER;

			case JULY:
				if (Hemisphere.SOUTH.equals(hemisphere)) {
					return Season.WINTER;
				}
				return Season.SUMMER;

			case AUGUST:
				if (Hemisphere.SOUTH.equals(hemisphere)) {
					return Season.WINTER;
				}
				return Season.SUMMER;

			// Fall in the North
			// Spring in the South
			case SEPTEMBER:
				if (Hemisphere.SOUTH.equals(hemisphere)) {
					return Season.SPRING;
				}
				return Season.FALL;

			case OCTOBER:
				if (Hemisphere.SOUTH.equals(hemisphere)) {
					return Season.SPRING;
				}
				return Season.FALL;

			// Winter in the north
			// Summer in the south
			case NOVEMBER:
				if (Hemisphere.SOUTH.equals(hemisphere)) {
					return Season.SUMMER;
				}
				return Season.WINTER;

			case DECEMBER:
				if (Hemisphere.SOUTH.equals(hemisphere)) {
					return Season.SUMMER;
				}
				return Season.WINTER;

			default:
				// FIXME: Handle reaching impossible point as error condition.
				System.out.println("ERROR: IMPOSSIBLE TO DEFINE THE SEASON");
				return null;
			}
		}
	}

}
