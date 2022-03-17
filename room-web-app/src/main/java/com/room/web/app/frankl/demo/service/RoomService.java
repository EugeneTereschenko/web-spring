package com.room.web.app.frankl.demo.service;

import com.room.web.app.frankl.demo.data.RoomRepository;
import com.room.web.app.frankl.demo.models.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms() {return roomRepository.findAll();}

    public Room getById(Long id) {
        return roomRepository.findById(id).get();
    }
}
