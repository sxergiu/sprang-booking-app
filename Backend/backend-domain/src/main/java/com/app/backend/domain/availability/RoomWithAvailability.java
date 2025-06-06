package com.app.backend.domain.availability;

import com.app.backend.domain.booking.TimeInterval;
import com.app.backend.domain.room.Room;

import java.util.List;
import java.util.Set;

public record RoomWithAvailability(
        Long id,
        String name,
        String location,
        int capacity,
        Set<String> amenities,
        List<TimeInterval> availableSlots
) {
    public RoomWithAvailability(Room room, List<TimeInterval> availableSlots) {
        this(
                room.getId(),
                room.getName(),
                room.getLocation(),
                room.getCapacity(),
                room.getAmenities(),
                availableSlots
        );
    }
}

