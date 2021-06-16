package com.MacbookStore.service;


import com.MacbookStore.model.DisplayCard;
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
    public Group get1Group(String groupId) {
        return groupRepository.findFirstById(groupId);
    }

    public void insertGroup(Group group) {
        groupRepository.insert(group);
    }

    public void updateGroup(Group group) { groupRepository.save(group); }

    public void deleteGroup(String groupId) { groupRepository.deleteById(groupId); }

    public String getGroupName(String groupId){
        return groupRepository.findFirstByGroupID(groupId).getGroupName();
    }

}
