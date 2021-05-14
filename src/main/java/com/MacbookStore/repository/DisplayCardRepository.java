package com.MacbookStore.repository;

import com.MacbookStore.model.DisplayCard;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Transactional
@Repository
public interface DisplayCardRepository extends MongoRepository<DisplayCard, String> {

}
