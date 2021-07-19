package by.romanitski.model;

public class Room {

    private Integer roomCapacity;
    private Boolean isFree = false;

    enum RoomClass {
        ECONOMY,
        COMFORT,
        BUSINESS,
        PREMIUM;
    }

    public Integer getRoomCapacity() {
        return roomCapacity;
    }

    public void setRoomCapacity(Integer roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    public Boolean getFree() {
        return isFree;
    }

    public void setFree(Boolean free) {
        isFree = free;
    }
}
