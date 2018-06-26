package com.zone;

import java.time.Month;

/**
 * @author adriano-fonseca
 * 
 * Spring -> South Hemisphere -> SEP, OCT
 * 			 
 * 			 North Hemisphere -> MAR, APR
 * 
 *
 * Summer -> North Hemisphere -> MAY, JUN, JUL, AUG 
 * 			
 * 			 South Hemisphere -> NOV, DEC, JAN, FEB
 * 
 *
 * Fall -> South Hemisphere -> MAR, APR
 * 			 
 * 		   North Hemisphere -> SEP, OCT
 * 			 
 * 
 * Winter -> South Hemisphere -> MAY, JUN, JUL, AUG
 * 			 
 * 			 North Hemisphere -> NOV, DEC, JAN, FEB
 * 
 * 
 */
public enum Season {
    SPRING, SUMMER, FALL, WINTER;
	
	
    static public Season of(Month month, Hemisphere hemisphere) {
        switch ( month ) {

            // Spring in the north
            // Fall in the South
            case MARCH:
            	if(Hemisphere.SOUTH.equals(hemisphere)) {
            		return Season.FALL;
            	}
                return Season.SPRING;

            case APRIL:
            	if(Hemisphere.SOUTH.equals(hemisphere)) {
            		return Season.FALL;
            	}
                return Season.SPRING;

            // Winter in the south
            // Summer in the north
            case MAY:
            	if(Hemisphere.SOUTH.equals(hemisphere)) {
            		return Season.WINTER;
            	}
                return Season.SUMMER;

            case JUNE:
            	if(Hemisphere.SOUTH.equals(hemisphere)) {
            		return Season.WINTER;
            	}
                return Season.SUMMER;

            case JULY:
            	if(Hemisphere.SOUTH.equals(hemisphere)) {
            		return Season.WINTER;
            	}
                return Season.SUMMER;

            case AUGUST:
            	if(Hemisphere.SOUTH.equals(hemisphere)) {
            		return Season.WINTER;
            	}
                return Season.SUMMER;

            // Fall in the North 
            // Spring in the South
            case SEPTEMBER:
            	if(Hemisphere.SOUTH.equals(hemisphere)) {
            		return Season.SPRING;
            	}
                return Season.FALL;

            case OCTOBER:
            	if(Hemisphere.SOUTH.equals(hemisphere)) {
            		return Season.SPRING;
            	}
                return Season.FALL;

            // Winter in the north
            // Summer in the south
            case NOVEMBER:
            	if(Hemisphere.SOUTH.equals(hemisphere)) {
            		return Season.SUMMER;
            	}
                return Season.WINTER;

            case DECEMBER:
            	if(Hemisphere.SOUTH.equals(hemisphere)) {
            		return Season.SUMMER;
            	}
                return Season.WINTER;

            case JANUARY:
            	if(Hemisphere.SOUTH.equals(hemisphere)) {
            		return Season.SUMMER;
            	}
                return Season.WINTER;

            case FEBRUARY:
            	if(Hemisphere.SOUTH.equals(hemisphere)) {
            		return Season.SUMMER;
            	}
                return Season.WINTER;

            default:
            	// FIXME: Handle reaching impossible point as error condition.
                System.out.println ( "ERROR: IMPOSSIBLE TO DEFINE THE SEASON" );  
                return null;
        }
    }
}

