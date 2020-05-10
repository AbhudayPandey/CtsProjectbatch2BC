package com.cts.controller;

import java.util.List;

import com.cts.dto.StatisticsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.Statistics;
import com.cts.service.StatisticsService1;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import io.swagger.annotations.ApiOperation;


@RestController

public class StatisticsController {

    private StatisticsService1 statService1;

    @Autowired
    public void setAvgService1(StatisticsService1 statService1) {
        this.statService1 = statService1;
    }

    //Method for Getting the Statistics of Transaction
    @GetMapping("/statistics")
    @HystrixCommand(fallbackMethod="getfallbacksearch")
    @ResponseBody
    @ApiOperation(value = "Find All Transactions Statistics",
	notes="Return all transaction statistics with there details",
	response = Statistics.class)
    public ResponseEntity<StatisticsDto> getStatistics(){
        StatisticsDto statisticsDto = statService1.getStatistics();
        return new ResponseEntity<StatisticsDto>(statisticsDto, HttpStatus.OK);
    }
    public ResponseEntity<StatisticsDto> getfallbacksearch(){
    	return null;
    }


}
	
		
	
	
