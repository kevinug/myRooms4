package controller;


import model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.RoomService;

import java.util.List;

@RestController
//@RequestMapping("/api/v1/courses")
//@CrossOrigin(origins = "http://localhost:4200") // Consenti al frontend Angular di connettersi
public class RoomController {

    @Autowired
    private RoomService roomService;

    @GetMapping("/ciao")
    public List<Room> getAllRooms() {
        return roomService.getAllRooms();
    }

//    @GetMapping("/{id}")
//    public Room getRoomById(@PathVariable Long id) {
//        return roomService.getRoomById(id).orElseThrow(() -> new RuntimeException("Room not found"));
//    }

//    @PutMapping("/{id}")
//    public Room updateRoomStatus(@PathVariable Long id, @RequestBody Room updatedRoom) {
//        return roomService.updateRoomStatus(id, updatedRoom.getStatus());
//    }
}
