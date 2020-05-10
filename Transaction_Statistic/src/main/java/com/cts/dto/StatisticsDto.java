package com.cts.dto;

import lombok.Data;
import lombok.NonNull;

@Data
@NonNull
public class StatisticsDto {
	
    private Double max;
    private Long count;
    private Double min;
    private Double avg;
    private Double sum;
 
}
