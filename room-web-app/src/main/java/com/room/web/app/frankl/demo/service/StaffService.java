package com.room.web.app.frankl.demo.service;

import com.room.web.app.frankl.demo.data.RoomRepository;
import com.room.web.app.frankl.demo.data.StaffRepository;
import com.room.web.app.frankl.demo.models.Position;
import com.room.web.app.frankl.demo.models.Room;
import com.room.web.app.frankl.demo.models.StaffMember;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StaffService {
    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<StaffMember> getAllStaff() {return staffRepository.findAll();}
}
