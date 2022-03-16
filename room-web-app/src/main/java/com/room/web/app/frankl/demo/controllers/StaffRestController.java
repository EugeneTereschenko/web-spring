package com.room.web.app.frankl.demo.controllers;

import com.room.web.app.frankl.demo.models.StaffMember;
import com.room.web.app.frankl.demo.service.StaffService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class StaffRestController {

    private final StaffService staffService;

    public StaffRestController(StaffService staffService) { this.staffService = staffService; }

    @GetMapping
    public List<StaffMember> getAllStaff() { return staffService.getAllStaff(); }
}
