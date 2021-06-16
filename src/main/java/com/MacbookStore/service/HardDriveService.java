package com.MacbookStore.service;

import com.MacbookStore.model.Group;
import com.MacbookStore.model.HardDrive;
import com.MacbookStore.repository.HardDriveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class  HardDriveService {
    @Autowired
    private HardDriveRepository hardDriveRepository;

    public List<HardDrive> getAllHardDrive() {
        return hardDriveRepository.findAll();
    }
    public HardDrive get1HardDrive(String hardDriveId) {
        return hardDriveRepository.findFirstById(hardDriveId);
    }

    public void insertHardDrive(HardDrive hardDrive) {
        hardDriveRepository.insert(hardDrive);
    }

    public void updateHardDrive(HardDrive hardDrive) { hardDriveRepository.save(hardDrive); }

    public void deleteHardDrive(String hardDriveId) { hardDriveRepository.deleteById(hardDriveId); }

}
