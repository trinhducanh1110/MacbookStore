package com.MacbookStore.service;

import com.MacbookStore.model.CPU;
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
    public Display get1Display(String displayId) {
        return displayRepository.findFirstById(displayId);
    }

    public void insertDisplay(Display display) {
        displayRepository.insert(display);
    }

    public void updateDisplay(Display display) { displayRepository.save(display); }

    public void deleteDisplay(String displayId) { displayRepository.deleteById(displayId); }

    public String getDisplayName(String displayId){
        return displayRepository.findFirstByDisplayID(displayId).getDisplayName();
    }

}
