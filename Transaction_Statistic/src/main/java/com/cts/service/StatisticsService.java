package com.cts.service;


import com.cts.dto.StatisticsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.cts.repository.StatisticsRepository;


@Service
public class StatisticsService implements StatisticsService1 {
    @Autowired
    private StatisticsRepository repository;

    @Transactional
    public Double avg() {
        return repository.avg();
    }

    @Transactional
    public long count() {
        return repository.count();
    }

    @Transactional
    public Double max() {
        // TODO Auto-generated method stub
        return repository.max();
    }

    @Transactional
    public Double min() {
        // TODO Auto-generated method stub
        return repository.min();
    }

    @Transactional
    public Double sum() {
        return repository.sum();
    }

    //Implementing the DTO
    public StatisticsDto getStatistics(){
    	StatisticsDto stats = new StatisticsDto();
    	stats.setAvg(avg());
    	stats.setCount(count());
    	stats.setMax(max());
    	stats.setMin(min());
    	stats.setSum(sum());
    	return stats;
	}

}
