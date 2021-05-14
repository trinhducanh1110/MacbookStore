package com.MacbookStore.service;

import com.MacbookStore.model.Color;
import com.MacbookStore.repository.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class  ColorService {
    @Autowired
    private ColorRepository colorRepository;

    public List<Color> getAllColor() {
        return colorRepository.findAll();
    }

    public void insertColor(Color color) {
        colorRepository.insert(color);
    }

    public void editColor(Color color) { colorRepository.save(color); }

    public void deleteColor(Color color) { colorRepository.delete(color); }

}
