package com.MacbookStore.repository;


import com.MacbookStore.model.CPU;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface CpuRepository extends MongoRepository<CPU, String> {

}