package com.MacbookStore.repository;


import com.MacbookStore.model.CPU;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Transactional
@Repository
public interface CpuRepository extends MongoRepository<CPU, String> {
    CPU findFirstById(String cpuID);
    void deleteById(String cpuID);
}
