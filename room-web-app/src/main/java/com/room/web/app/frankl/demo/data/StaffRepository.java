package com.room.web.app.frankl.demo.data;

import com.room.web.app.frankl.demo.models.StaffMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<StaffMember, String> {
}
