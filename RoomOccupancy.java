/************************************************
 * Created by Colten Coffman					*
 * 11/3/2018 COSC 1337							*
 * This program record the number of people in  *
 * the rooms of a building and their charges.	*
 ************************************************/

 public class RoomOccupancy
{
    private int numberInRoom;
    static private int totalNumber = 0;
    private double roomCharges;

    public void addOneToRoom()
    {
        numberInRoom ++;
        totalNumber ++;
    }

    public void removeOneFromRoom()
    {
        if(numberInRoom > 0)
        {
            numberInRoom --;
            totalNumber --;
        }
    }

    public int getNumber()
    {
        return numberInRoom;
    }

    public static int getTotal()
    {
        return totalNumber;
    }

    public RoomOccupancy()
    {
        numberInRoom = 0;
        roomCharges = 0.0;
    }

    public RoomOccupancy(int number, double charges)
    {

        if(number >= 0)
        {
            numberInRoom = number;
        }
        else
        {
            numberInRoom = 0;
        }
        roomCharges = charges;
        totalNumber += numberInRoom;
    }

    public RoomOccupancy(RoomOccupancy ro)
    {
        numberInRoom = ro.numberInRoom;
        roomCharges = ro.roomCharges;
        totalNumber += numberInRoom;
    }

    public int getNumberInRoom()
    {
        return numberInRoom;
    }

    public double getRoomCharges()
    {
        return roomCharges;
    }

    public void setNumberInRoom(int number)
    {

        if(number >= 0)
        {
            int numberMinusRoom = number - numberInRoom;
            numberInRoom = number;
            totalNumber += numberMinusRoom;
        }
    }

    public void setRoomCharges(double charges)
    {
        roomCharges = charges;
    }

    public String toString()
    {
        String s = new String();
        s += "Number In Room: " + numberInRoom + ", Room Charges: $" + roomCharges;
        return s;
    }

    public boolean equals(Object o)
    {
        if (o == this)
        {
            return true;
        }
        if (!(o instanceof RoomOccupancy))
        {
            return false;
        }
        RoomOccupancy ro = (RoomOccupancy)o;

        if(numberInRoom == ro.numberInRoom && roomCharges == ro.roomCharges)
            return true;
        else
            return false;
    }

    public void finalize()
    {
        totalNumber -= numberInRoom;
    }
}