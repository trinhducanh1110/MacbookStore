package com.MacbookStore.service;

import com.MacbookStore.model.RAM;
import com.MacbookStore.repository.RamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class  RamService {
    @Autowired
    private RamRepository ramRepository;

    public List<RAM> getAllRam() {
        return ramRepository.findAll();
    }

    public void insertRam(RAM ram) {
        ramRepository.insert(ram);
    }

    public void editRam(RAM ram) { ramRepository.save(ram); }

    public void deleteRam(RAM ram) { ramRepository.delete(ram); }

}
