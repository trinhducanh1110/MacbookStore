package com.MacbookStore.service;

import com.MacbookStore.model.Color;
import com.MacbookStore.model.Display;
import com.MacbookStore.repository.DisplayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class  DisplayService {
    @Autowired
    private DisplayRepository displayRepository;

    public List<Display> getAllDisplay() {
        return displayRepository.findAll();
    }

    public void insertDisplay(Display display) {
        displayRepository.insert(display);
    }

    public void editDisplay(Display display) { displayRepository.save(display); }

    public void deleteDisplay(Display display) { displayRepository.delete(display); }

}
