package com.room.web.app.frankl.demo.data;

import com.room.web.app.frankl.demo.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
