package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(2, 1);
        Room room2 = new Room(1, 3);
        Room room3 = new Room(3, 4);

        ArrayList<Room> hotelRooms = new ArrayList<Room>();
        hotelRooms.add(room1);
        hotelRooms.add(room2);
        hotelRooms.add(room3);

        Building hotel = new Building(hotelRooms, 2);
        Building aNormalHotel = new Building(hotelRooms, 4);

        System.out.println(countLampsInBuilding(hotel));
        System.out.println(countWindowsInBuilding(hotel));
        System.out.println(countRoomsInBuilding(hotel));

        System.out.println(isNormal(hotel));
        System.out.println(isNormal(aNormalHotel));
    }

    public static int countLampsInBuilding(Building buildingWithLamps) {
        int sumOfLamps = 0;
        for (int l : buildingWithLamps.getRoomLamps()) {
            sumOfLamps += l;
        }
        return sumOfLamps;
    }

    public static int countWindowsInBuilding(Building buildingWithWindows) {
        int sumOfWindows = 0;
        for (int w : buildingWithWindows.getRoomWindows()) {
            sumOfWindows += w;
        }
        return sumOfWindows;
    }

    public static int countRoomsInBuilding(Building buildingWithRooms) {
        int sumOfRooms = 0;
        while (sumOfRooms < buildingWithRooms.getRoom().size()) {
            sumOfRooms += 1;
        }
        return sumOfRooms;
    }

    public static boolean isNormal(Building buildingToCheck){
        return buildingToCheck.getNumberOfFloors() < countRoomsInBuilding(buildingToCheck);
    }
}
