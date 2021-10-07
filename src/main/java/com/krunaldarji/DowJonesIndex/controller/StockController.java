package com.krunaldarji.DowJonesIndex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.krunaldarji.DowJonesIndex.exception.StockNotFoundException;
import com.krunaldarji.DowJonesIndex.model.entity.Stock;
import com.krunaldarji.DowJonesIndex.model.json.StockDTO;
import com.krunaldarji.DowJonesIndex.service.StockService;

@RestController
@RequestMapping("/api/stocks")
public class StockController {
	
	@Autowired
	private StockService stockService;
	
	
	@GetMapping("")
	public ResponseEntity<List<StockDTO>> getAllTutorials(@RequestParam(name="ticker", required=false) String ticker) throws StockNotFoundException {
			List<StockDTO> records = stockService.getRecordByTicker(ticker);
			if(records.size()!=0) {
				return new ResponseEntity<>(records, HttpStatus.OK);
			}else {
				throw new StockNotFoundException("No stock records with ticker - "+ticker);
			}
	}
	
	@PostMapping("bulk")
    public ResponseEntity<String> addStocks(@RequestBody List<Stock> stocks) throws Exception {
        try {
        	String successMsg=stockService.addBulkRecords(stocks);
			return new ResponseEntity<>(successMsg, HttpStatus.CREATED);
        }catch(Exception e) {
        	throw new Exception("Something went wrong");
        }
    }
	
	@PostMapping("")
    public ResponseEntity<StockDTO> addStocks(@RequestBody Stock stock) throws Exception {
		try {
        	StockDTO newStock=stockService.addRecord(stock);
			return new ResponseEntity<>(newStock, HttpStatus.CREATED);
        }catch(Exception e) {
        	throw new Exception("Something went wrong");
        }
    }

}
