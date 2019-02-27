public class FlourPacker {
    public static void main(String[] args) {
        //canPack();
    }
    static boolean canPack(int bigCount,int smallCount,int goal){
        if(goal <= (smallCount + bigCount)){
            return true;
        } else
            return false;
    }
}
