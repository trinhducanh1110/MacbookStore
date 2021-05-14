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

    public void insertDisplayCard(DisplayCard displayCard) {
        displayCardRepository.insert(displayCard);
    }

    public void editDisplayCard(DisplayCard displayCard) { displayCardRepository.save(displayCard); }

    public void deleteDisplayCard(DisplayCard displayCard) { displayCardRepository.delete(displayCard); }

}
