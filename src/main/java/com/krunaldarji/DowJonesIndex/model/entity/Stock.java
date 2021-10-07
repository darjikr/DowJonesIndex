package com.krunaldarji.DowJonesIndex.model.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STOCK")
public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int quarter;
	private String stock;
	private Date date;
	private double open;
	private double high;
	private double low;
	private double close;
	private long volume;
	private double percentChangePrice;
	private double percentChangeVolumeOverLastWk;
	private long previousWeeksVolume;
	private double nextWeeksOpen;
	private double nextWeeksClose;
	private double percentChangeNextWeeksPrice;
	private int daysToNextDividend;
	private double percentReturnNextDividend;
	
	
	public Stock() {
	}


	public Stock(int quarter, String stock, Date date, double open, double high, double low, double close, long volume,
			double percentChangePrice, double percentChangeVolumeOverLastWk, long previousWeeksVolume,
			double nextWeeksOpen, double nextWeeksClose, double percentChangeNextWeeksPrice, int daysToNextDividend,
			double percentReturnNextDividend) {
		this.quarter = quarter;
		this.stock = stock;
		this.date = date;
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = close;
		this.volume = volume;
		this.percentChangePrice = percentChangePrice;
		this.percentChangeVolumeOverLastWk = percentChangeVolumeOverLastWk;
		this.previousWeeksVolume = previousWeeksVolume;
		this.nextWeeksOpen = nextWeeksOpen;
		this.nextWeeksClose = nextWeeksClose;
		this.percentChangeNextWeeksPrice = percentChangeNextWeeksPrice;
		this.daysToNextDividend = daysToNextDividend;
		this.percentReturnNextDividend = percentReturnNextDividend;
	}


	public int getQuarter() {
		return quarter;
	}


	public void setQuarter(int quarter) {
		this.quarter = quarter;
	}


	public String getStock() {
		return stock;
	}


	public void setStock(String stock) {
		this.stock = stock;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public double getOpen() {
		return open;
	}


	public void setOpen(double open) {
		this.open = open;
	}


	public double getHigh() {
		return high;
	}


	public void setHigh(double high) {
		this.high = high;
	}


	public double getLow() {
		return low;
	}


	public void setLow(double low) {
		this.low = low;
	}


	public double getClose() {
		return close;
	}


	public void setClose(double close) {
		this.close = close;
	}


	public long getVolume() {
		return volume;
	}


	public void setVolume(long volume) {
		this.volume = volume;
	}


	public double getPercentChangePrice() {
		return percentChangePrice;
	}


	public void setPercentChangePrice(double percentChangePrice) {
		this.percentChangePrice = percentChangePrice;
	}


	public double getPercentChangeVolumeOverLastWk() {
		return percentChangeVolumeOverLastWk;
	}


	public void setPercentChangeVolumeOverLastWk(double percentChangeVolumeOverLastWk) {
		this.percentChangeVolumeOverLastWk = percentChangeVolumeOverLastWk;
	}


	public long getPreviousWeeksVolume() {
		return previousWeeksVolume;
	}


	public void setPreviousWeeksVolume(long previousWeeksVolume) {
		this.previousWeeksVolume = previousWeeksVolume;
	}


	public double getNextWeeksOpen() {
		return nextWeeksOpen;
	}


	public void setNextWeeksOpen(double nextWeeksOpen) {
		this.nextWeeksOpen = nextWeeksOpen;
	}


	public double getNextWeeksClose() {
		return nextWeeksClose;
	}


	public void setNextWeeksClose(double nextWeeksClose) {
		this.nextWeeksClose = nextWeeksClose;
	}


	public double getPercentChangeNextWeeksPrice() {
		return percentChangeNextWeeksPrice;
	}


	public void setPercentChangeNextWeeksPrice(double percentChangeNextWeeksPrice) {
		this.percentChangeNextWeeksPrice = percentChangeNextWeeksPrice;
	}


	public int getDaysToNextDividend() {
		return daysToNextDividend;
	}


	public void setDaysToNextDividend(int daysToNextDividend) {
		this.daysToNextDividend = daysToNextDividend;
	}


	public double getPercentReturnNextDividend() {
		return percentReturnNextDividend;
	}


	public void setPercentReturnNextDividend(double percentReturnNextDividend) {
		this.percentReturnNextDividend = percentReturnNextDividend;
	}


	public Long getId() {
		return id;
	}


	@Override
	public String toString() {
		return "Stock [id=" + id + ", quarter=" + quarter + ", stock=" + stock + ", date=" + date + ", open=" + open
				+ ", high=" + high + ", low=" + low + ", close=" + close + ", volume=" + volume
				+ ", percentChangePrice=" + percentChangePrice + ", percentChangeVolumeOverLastWk="
				+ percentChangeVolumeOverLastWk + ", previousWeeksVolume=" + previousWeeksVolume + ", nextWeeksOpen="
				+ nextWeeksOpen + ", nextWeeksClose=" + nextWeeksClose + ", percentChangeNextWeeksPrice="
				+ percentChangeNextWeeksPrice + ", daysToNextDividend=" + daysToNextDividend
				+ ", percentReturnNextDividend=" + percentReturnNextDividend + "]";
	}
	

}
