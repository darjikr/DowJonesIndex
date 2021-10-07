package com.krunaldarji.DowJonesIndex.model.json;

import java.sql.Date;

public class StockDTO {
	public Long id;
	public int quarter;
	public String stock;
	public Date date;
	public double open;
	public double high;
	public double low;
	public double close;
	public long volume;
	public double percentChangePrice;
	public double percentChangeVolumeOverLastWk;
	public long previousWeeksVolume;
	public double nextWeeksOpen;
	public double nextWeeksClose;
	public double percentChangeNextWeeksPrice;
	public int daysToNextDividend;
	public double percentReturnNextDividend;
	
}
