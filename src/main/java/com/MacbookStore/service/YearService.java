package com.MacbookStore.service;

import com.MacbookStore.model.RAM;
import com.MacbookStore.model.Year;
import com.MacbookStore.repository.YearRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class  YearService {
    @Autowired
    private YearRepository yearRepository;

    public List<Year> getAllYear() {
        return yearRepository.findAll();
    }

    public Year get1Year(String yearId) {
        return yearRepository.findFirstById(yearId);
    }

    public void insertYear(Year year) {
        yearRepository.insert(year);
    }

    public void updateYear(Year year) { yearRepository.save(year); }

    public void deleteYear(String yearId) { yearRepository.deleteById(yearId); }

}
