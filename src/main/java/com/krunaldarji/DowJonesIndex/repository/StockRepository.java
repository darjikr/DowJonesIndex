package com.krunaldarji.DowJonesIndex.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krunaldarji.DowJonesIndex.model.entity.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long>{

	List<Stock> findByStock(String ticker);

}
