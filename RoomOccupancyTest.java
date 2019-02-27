/************************************************
 * Created by Colten Coffman					*
 * 11/3/2018 COSC 1337							*
 * This program will serve as the test file for *
 * RoomOccupancy.java							*
 ************************************************/

 public class RoomOccupancyTest
{
    private static void printTotal()
    {
        System.out.println("Total Room Occupancy: " + RoomOccupancy.getTotal());
    }
    private static void printObj(int roomNumber, RoomOccupancy ro)
    {
        System.out.println("Room Number " + roomNumber + ": " + ro + ",");
    }
    public static void main(String [] arg)
    {
        printTotal();
        RoomOccupancy r1 = new RoomOccupancy(1, 250.50);
        printObj(101, r1);
        printTotal();
        RoomOccupancy r2 = new RoomOccupancy(r1);
        printObj(318, r2);
        printTotal();
        r1.addOneToRoom();
        printObj(202, r1);
        printTotal();
        r2.removeOneFromRoom();
        r2.removeOneFromRoom();
        printObj(124, r2);
        printTotal();
        RoomOccupancy r3 = new RoomOccupancy();
        printObj(315, r3);
        printTotal();
        r3.setRoomCharges(350.00);
        r3.setNumberInRoom(5);
        printObj(228, r3);
        printTotal();
        r1.finalize();
        printTotal();
    }
}