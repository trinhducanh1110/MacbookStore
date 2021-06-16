package com.MacbookStore.service;

import com.MacbookStore.model.CPU;
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

    public Color get1Color(String colorId) {
        return colorRepository.findFirstByColorID(colorId);
    }

    public void insertColor(Color color) {
        colorRepository.insert(color);
    }

    public void updateColor(Color color) { colorRepository.save(color); }

    public void deleteColor(String colorId) { colorRepository.deleteById(colorId); }

    public String getColorName(String colorID){
        return colorRepository.findFirstByColorID(colorID).getColorName();
    }

}
