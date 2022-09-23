public class House {
    String color;
    int floors;
    int numberRooms;
    int numberDoors;
    boolean parking;

    public House(String color,int floors,int numberRooms){
        this.color = color;
        this.floors = floors;
        this.numberRooms = numberRooms;
    }
    public House(String color,int floors, int numberRooms,int numberDoors,boolean parking){
        this.color = color;
        this.floors = floors;
        this.numberRooms = numberRooms;
        this.numberDoors = numberDoors;
        this.parking = parking;
    }
    public void Display(){
        System.out.println("Color: " + this.color + "\nFloors: " + this.floors + "\nNumber of rooms: " + this.numberRooms +
                           "\nNumber of doors: " + this.numberDoors + "\nThe house has parking: " + this.parking);
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setFloors(int floors){
        this.floors = floors;
    }
    public void setNumberRooms(int numberRooms){
        this.numberRooms = numberRooms;
    }
    public void setNumberDoors(int numberDoors){
        this.numberDoors = numberDoors;
    }
    public void setParking(boolean parking){
        this.parking = parking;
    }
}
