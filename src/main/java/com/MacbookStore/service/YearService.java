package com.MacbookStore.service;

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

    public void insertYear(Year year) {
        yearRepository.insert(year);
    }

    public void editYear(Year year) { yearRepository.save(year); }

    public void deleteYear(Year year) { yearRepository.delete(year); }

}
