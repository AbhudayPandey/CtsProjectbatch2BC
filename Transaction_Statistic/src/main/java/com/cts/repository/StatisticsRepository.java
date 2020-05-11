package com.cts.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.cts.model.Statistics;

@Repository
public interface StatisticsRepository extends JpaRepository<Statistics, Double> {

	 //Query for Finding the Average of the Amount
	 @Query(value="select avg(amount)from transaction_details",nativeQuery = true)
	 public Double avg();
	 //Query for Count the Total Number of Transactions
	 @Query(value="select count(amount) from transaction_details",nativeQuery = true)
	 public long count();
	 //Query for Finding the Maximum value of the Amount
	 @Query(value="select max(amount)from transaction_details",nativeQuery = true)
	 public Double max();
	 //Query for Finding the Minimum value of the Amount
	 @Query(value="select min(amount)from transaction_details",nativeQuery = true)
	 public Double min();
	 //Query for Calculate the Total value of the Amount
	 @Query(value="select sum(amount)from transaction_details",nativeQuery = true)
	 public Double sum();
}
 