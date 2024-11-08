package service;

import model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.RoomRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    public List<Room> getAllRooms() {
        return List.of(new Room());
        //return roomRepository.findAll();
    }

    public Optional<Room> getRoomById(Long id) {
        return null;
        //return roomRepository.findById(id);
    }

//    public Room updateRoomStatus(Long id, String status) {
//        Optional<Room> roomOpt = roomRepository.findById(id);
//        if (roomOpt.isPresent()) {
//            Room room = roomOpt.get();
//            room.setStato(status);
//            return roomRepository.save(room);
//        }
//        throw new RuntimeException("Room not found with id: " + id);
//    }
}
