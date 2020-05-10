package com.cts.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.Transaction;
import com.cts.repository.TransactionRepository;

@Service
@Transactional
public class TransactionService implements ITransactionService {
	
	@Autowired
	TransactionRepository repository;
	
	@Override
	//Implementation of the Get Method
	public List<Transaction> getAllTransact(){
		return (List<Transaction>) repository.findAll();
	}
	
	@Override
	//Implementation of the Post Method
	public Transaction saveTransact(Transaction transact) {
		return repository.save(transact);
	}
	
	@Override
	//Implementation of the GetById Method Using the ID
	public Optional<Transaction> getById(Long id) {
		return repository.findById(id);
	}
	
	@Override
	//Implementation of the Delete Method Using the ID
	public void deleteTransact(Long id) {
		repository.deleteById(id);
	}



}
