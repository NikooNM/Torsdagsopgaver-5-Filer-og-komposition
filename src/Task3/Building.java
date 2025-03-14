package Task3;

import java.util.ArrayList;

public class Building {
    private ArrayList<Room> rooms;
    private int numberOfFloors;

    Building(ArrayList<Room> rooms, int numberOfFloors){
        this.rooms = rooms;
        this.numberOfFloors = numberOfFloors;
    }

    public ArrayList<Room> getRoom(){
        return this.rooms;
    }

    public ArrayList<Integer> getRoomLamps(){
        ArrayList<Integer> roomLampsList = new ArrayList<Integer>();
        for (Room r : this.rooms){
            roomLampsList.add(r.getNumberOfLamps());
        }
        return roomLampsList;
    }

    public ArrayList<Integer> getRoomWindows() {
        ArrayList<Integer> roomWindowsList = new ArrayList<Integer>();
        for (Room r : this.rooms) {
            roomWindowsList.add(r.getNumberOfWindows());
        }
        return roomWindowsList;
    }

    public void setRooms(int newRoomLamps, int newRoomWindows, int newFloors){
        for (Room r : this.rooms){
            r.setNumberOfLamps(newRoomLamps);
            r.setNumberOfWindows(newRoomWindows);
        }
    }

    public int getNumberOfFloors(){
        return this.numberOfFloors;
    }

    public void setNumberOfFloors(int newNumber){
        this.numberOfFloors = newNumber;
    }
}
