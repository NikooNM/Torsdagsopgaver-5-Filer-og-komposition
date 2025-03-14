package Task3;

public class Room {
    private int numberOfLamps;
    private int numberOfWindows;

    Room(int numberOfLamps, int numberOfWindows){
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    public int getNumberOfLamps(){
        return this.numberOfLamps;
    }

    public void setNumberOfLamps(int newNumber){
        this.numberOfLamps = newNumber;
    }

    public int getNumberOfWindows(){
        return this.numberOfWindows;
    }

    public void setNumberOfWindows(int newNumber){
        this.numberOfWindows = newNumber;
    }
}
