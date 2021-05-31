package com.MacbookStore.service;

import com.MacbookStore.model.CPU;
import com.MacbookStore.model.Product;
import com.MacbookStore.repository.CpuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class  CpuService {
    @Autowired
    private CpuRepository cpuRepository;

    public List<CPU> getAllCpu() {
        return cpuRepository.findAll();
    }

    public CPU get1Cpu(String cpuId) {
        return cpuRepository.findFirstById(cpuId);
    }

    public void insertCpu(CPU cpu) {
        cpuRepository.insert(cpu);
    }

    public void editCpu(CPU cpu) { cpuRepository.save(cpu); }

    public void deleteCpu(String cpuId) { cpuRepository.deleteById(cpuId); }

}
