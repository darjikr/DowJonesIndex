package com.krunaldarji.DowJonesIndex.model.json.converter;

import org.springframework.stereotype.Component;

import com.krunaldarji.DowJonesIndex.model.entity.Stock;
import com.krunaldarji.DowJonesIndex.model.json.StockDTO;

@Component
public class StockConverter {
	
	public StockConverter() {
		
	}
	
	public StockDTO toDTO(Stock stock) {
		StockDTO dto = new StockDTO();
		dto.id = stock.getId();
		dto.quarter = stock.getQuarter();
		dto.stock = stock.getStock();
		dto.date = stock.getDate();
		dto.open = stock.getOpen();
		dto.high = stock.getHigh();
		dto.low = stock.getLow();
		dto.close = stock.getClose();
		dto.volume = stock.getVolume();
		dto.percentChangePrice = stock.getPercentChangePrice();
		dto.percentChangeVolumeOverLastWk = stock.getPercentChangeVolumeOverLastWk();
		dto.previousWeeksVolume = stock.getPreviousWeeksVolume();
		dto.nextWeeksOpen = stock.getNextWeeksOpen();
		dto.nextWeeksClose = stock.getNextWeeksClose();
		dto.percentChangeNextWeeksPrice = stock.getPercentChangeNextWeeksPrice();
		dto.daysToNextDividend = stock.getDaysToNextDividend();
		dto.percentReturnNextDividend = stock.getPercentReturnNextDividend();
	
		return dto;
		
	}
}
