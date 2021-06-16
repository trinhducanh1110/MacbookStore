package com.MacbookStore.repository;


import com.MacbookStore.model.DisplayCard;
import com.MacbookStore.model.Group;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Transactional
@Repository
public interface GroupRepository extends MongoRepository<Group, String> {
    Group findFirstById(String groupID);
    void deleteById(String groupID);
    Group findFirstByGroupID(String groupId);
}
