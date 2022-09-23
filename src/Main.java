public class Main {
    public static void main(String[] args) {
        House house1 = new House("White",4,10);
        house1.setParking(true);
        house1.Display();

        House house2 = new House("Orange",2,7,1, true);
        house2.setNumberDoors(2);
        house2.Display();
    }
}
