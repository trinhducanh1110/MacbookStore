package com.MacbookStore.repository;

import com.MacbookStore.model.HardDrive;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Transactional
@Repository
public interface HardDriveRepository extends MongoRepository<HardDrive, String> {
    HardDrive findByHardDriveID(String hardDriveID);
    HardDrive findByHardDriveName(String hardDriveName);
    void deleteByHardDriveID(String hardDriveID);
}
