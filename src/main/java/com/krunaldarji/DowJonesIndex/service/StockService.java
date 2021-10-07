package com.krunaldarji.DowJonesIndex.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krunaldarji.DowJonesIndex.model.entity.Stock;
import com.krunaldarji.DowJonesIndex.model.json.StockDTO;
import com.krunaldarji.DowJonesIndex.model.json.converter.StockConverter;
import com.krunaldarji.DowJonesIndex.repository.StockRepository;

@Service
public class StockService {
	
	@Autowired
	private StockRepository stockRepository;
	@Autowired
	private StockConverter stockConverter;
	
	public List<StockDTO> getRecordByTicker(String ticker){
		List<StockDTO> tickerRecords = new ArrayList<>();
		if (ticker == null) stockRepository.findAll().forEach(record->{
			tickerRecords.add(stockConverter.toDTO(record));
		});
		else stockRepository.findByStock(ticker).forEach(record->{
			tickerRecords.add(stockConverter.toDTO(record));
		});
		return tickerRecords;
	}

	public String addBulkRecords(List<Stock> stocks) {
		if(stocks != null && !stocks.isEmpty()) {
			stockRepository.saveAll(stocks);	
			return String.format("Added %d stocks.", stocks.size());
		} 
	    return null;
	}
	
	public StockDTO addRecord(Stock stock) {
		if(stock!=null) {
		 return stockConverter.toDTO(stockRepository.save(stock));
		}
		return null;
	}
}
