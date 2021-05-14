package com.MacbookStore.service;

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

    public void insertHardDrive(HardDrive hardDrive) {
        hardDriveRepository.insert(hardDrive);
    }

    public void editHardDrive(HardDrive hardDrive) { hardDriveRepository.save(hardDrive); }

    public void deleteHardDrive(HardDrive hardDrive) { hardDriveRepository.delete(hardDrive); }

}
