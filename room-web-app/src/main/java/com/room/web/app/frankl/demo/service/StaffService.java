package com.room.web.app.frankl.demo.service;

import com.room.web.app.frankl.demo.models.Position;
import com.room.web.app.frankl.demo.models.StaffMember;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StaffService {
    private static final List<StaffMember> staff = new ArrayList<>();

    static {
        staff.add(new StaffMember(UUID.randomUUID().toString(), "John", "Doe", Position.CONCIERGE));
        staff.add(new StaffMember(UUID.randomUUID().toString(), "John", "Doe", Position.FRONT_DESK));
        staff.add(new StaffMember(UUID.randomUUID().toString(), "Oliver", "Handler", Position.SECURITY));
        staff.add(new StaffMember(UUID.randomUUID().toString(), "Sammy", "Smith", Position.HOUSEKEEPING));
    }

    public List<StaffMember> getAllStaff() { return staff; }
}
