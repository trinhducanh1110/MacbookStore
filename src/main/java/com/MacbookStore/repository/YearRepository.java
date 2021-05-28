package com.MacbookStore.repository;


import com.MacbookStore.model.HardDrive;
import com.MacbookStore.model.Year;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Transactional
@Repository
public interface YearRepository extends MongoRepository<Year, String> {
    Year findByYearID(String yearID);
    Year findByYearName(String yearName);
    void deleteByYearID(String yearID);
}