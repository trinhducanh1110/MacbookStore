package com.MacbookStore.repository;

import com.MacbookStore.model.Group;
import com.MacbookStore.model.HardDrive;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Transactional
@Repository
public interface HardDriveRepository extends MongoRepository<HardDrive, String> {
    HardDrive findFirstById(String hardDriveID);
    void deleteById(String hardDriveID);
    HardDrive findFirstByHardDriveID(String id);
}
