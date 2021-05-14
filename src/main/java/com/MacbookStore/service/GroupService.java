package com.MacbookStore.service;


import com.MacbookStore.model.Group;
import com.MacbookStore.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class  GroupService {
    @Autowired
    private GroupRepository groupRepository;

    public List<Group> getAllGroup() {
        return groupRepository.findAll();
    }

    public void insertGroup(Group group) {
        groupRepository.insert(group);
    }

    public void editGroup(Group group) { groupRepository.save(group); }

    public void deleteGroup(Group group) { groupRepository.delete(group); }

}
