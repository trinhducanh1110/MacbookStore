package com.MacbookStore.service;

import com.MacbookStore.model.Color;
import com.MacbookStore.model.Display;
import com.MacbookStore.model.DisplayCard;
import com.MacbookStore.repository.DisplayCardRepository;
import com.MacbookStore.repository.DisplayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class  DisplayCardService {
    @Autowired
    private DisplayCardRepository displayCardRepository;

    public List<DisplayCard> getAllDisplayCard() {
        return displayCardRepository.findAll();
    }

    public DisplayCard get1DisplayCard(String displayCardId) {
        return displayCardRepository.findFirstById(displayCardId);
    }

    public void insertDisplayCard(DisplayCard displayCard) {
        displayCardRepository.insert(displayCard);
    }

    public void updateDisplayCard(DisplayCard displayCard) { displayCardRepository.save(displayCard); }

    public void deleteDisplayCard(String displayCardId) { displayCardRepository.deleteById(displayCardId); }

    public String getDisplayCardId(String displayCardId){
        return displayCardRepository.findFirstByDisplayCardID(displayCardId).getDisplayCardID();
    }

}
