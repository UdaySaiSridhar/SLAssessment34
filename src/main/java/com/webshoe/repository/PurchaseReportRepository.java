package com.webshoe.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.webshoe.entity.PurchaseReport;



@Repository
public interface PurchaseReportRepository extends JpaRepository<PurchaseReport, Integer> {

	@Query("select pr from PurchaseReport pr where pr.categoryOfProduct=:category")
	List<PurchaseReport> findAllByCategory(@Param("category") String category);

	@Query("select pr from PurchaseReport pr where pr.dateOfProductPurchase=:date")
	List<PurchaseReport> findAllByDate(@Param("date") Date date);

}
