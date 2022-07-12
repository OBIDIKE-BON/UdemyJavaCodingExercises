public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay >=0 && hourOfDay<=23){
            if(barking && hourOfDay<8 ){
                return true;
            }else if(barking && hourOfDay>22 ){
                return true;
            }
        }else{
            return false;
        }
        return false;
    }
}
