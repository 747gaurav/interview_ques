package com.accolite.morgan.stanley;

import java.util.Date;

public class PeriodImmutable {

	private final Date startDate, endDate;
	
	private PeriodImmutable(Date startDate, Date endDate){
		this.startDate = (Date)startDate.clone();
		this.endDate = (Date)endDate.clone();
	}
	
	public final Date getStartDate(){
		return (Date)startDate.clone();
	}
	
	public final Date getEndDate(){
		return (Date)endDate.clone();
	}
}
