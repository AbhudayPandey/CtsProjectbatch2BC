package com.cts.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class TransactionException extends RuntimeException{
	
	private Long id;

	//Handle the Exception Using the ID i.e Id Not Found
    public TransactionException(Long id) {
		super(String.format("Transaction ID %s is Not Found!!! ", id));
		this.id = id;
	}

    public Object getFieldValue() {
        return id;
    
}

}
