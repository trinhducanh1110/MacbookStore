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
    CPU findByCpuID(String cpuID);
    CPU findByCpuName(String cpuName);
    void deleteByCpuID(String cpuID);
}
