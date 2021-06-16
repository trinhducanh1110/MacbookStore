package com.MacbookStore.repository;

import com.MacbookStore.model.Color;
import com.MacbookStore.model.Display;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Transactional
@Repository
public interface DisplayRepository extends MongoRepository<Display, String> {
    Display findFirstById(String displayID);
    void deleteById(String displayID);
}
