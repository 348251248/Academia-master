/**
 * 
 */
package edu.uta.cse.academia.Models;

public class Availability
{
	private Days[] days;

    public Days[] getDays ()
    {
        return days;
    }

    public void setDays (Days[] days)
    {
        this.days = days;
    }

    @Override
    public String toString()
    {
    	String result="Days[";
       for(Days day : days){
    	   result+=day.getName()+",";
       }
       result+="]";
       return result;
    }
}

