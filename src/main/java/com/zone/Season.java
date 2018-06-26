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
        switch  (month) {

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
                System.out.println ( "ERROR: IMPOSSIBLE TO DEFINE THE SEASON" );  
                return null;
        }
    }
}

