package com.MacbookStore.repository;


import com.MacbookStore.model.RAM;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Transactional
@Repository
public interface RamRepository extends MongoRepository<RAM, String> {
    RAM findByRamID(String ramID);
    RAM findByRamName(String ramName);
    void deleteByRamID(String ramID);
}
