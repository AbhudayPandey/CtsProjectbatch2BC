package com.cts.service;

import java.util.List;
import java.util.Optional;

import com.cts.model.Transaction;

public interface ITransactionService {

	//Declaration of the Get Method
	public List<Transaction> getAllTransact();
	//Declaration of the Insert Method
	public Transaction saveTransact(Transaction transact);
	//Declaration of the GetById Method using the ID
	public Optional<Transaction> getById(Long id);
	//Declaration of the Delete Method using the ID
	public void deleteTransact(Long id);
}
