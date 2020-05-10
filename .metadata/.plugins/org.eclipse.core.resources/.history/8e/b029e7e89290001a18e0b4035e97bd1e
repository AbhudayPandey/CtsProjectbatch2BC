package com.cts.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.cts.model.Statistics;

@Repository
public interface StatRepository extends JpaRepository<Statistics, Double> {

	 @Query(value="select avg(amount)from statistics",nativeQuery = true)
	 public Double avg();
	 @Query(value="select count(amount) from statistics",nativeQuery = true)
	 public long count();
	 @Query(value="select max(amount)from statistics",nativeQuery = true)
	 public Double max();
	 @Query(value="select min(amount)from statistics",nativeQuery = true)
	 public Double min();
	 @Query(value="select sum(amount)from statistics",nativeQuery = true)
	 public Double sum();
}
 