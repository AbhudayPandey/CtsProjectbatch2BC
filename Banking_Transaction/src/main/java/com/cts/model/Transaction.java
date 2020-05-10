package com.cts.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@NonNull
@Entity
@Table(name = "transaction_details")
@ApiModel(description = "Details About the Transactions")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"transactAt"}, 
        allowGetters = true)
public class Transaction {
	@ApiModelProperty(notes = "The Transaction's ID which is Unique")
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	//Declare the ID for the Transaction which is Unique
    private Long id;

	@ApiModelProperty(notes = "The Transaction's Amount")
	//Declare the Amount for the Transaction
    private Double amount;

	@ApiModelProperty(notes = "The Transaction's TimeStamp")
    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    //Declare the TimeStamp for the Transaction
    private Date transactAt;

	
    

}
