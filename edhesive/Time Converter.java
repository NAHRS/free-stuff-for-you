/***********************
 * not written by raul *
***********************/
import java.util.Scanner;
import java.lang.Math;

class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Seconds Since Unix Epoch:");
        
        long sec = s.nextLong();
        
        long yr = (sec / 31104000);
        sec -= yr * 31104000;
        yr += 1970;
        long mon = sec / 2592000;
        sec -= mon * 2592000;
        long day = sec / 86400;
        sec -= day * 86400;
        long hr = sec / 3600;
        sec -= hr * 3600;
        long min = sec / 60;
        sec -= min * 60;
        
        System.out.println("Year: " + yr);
        System.out.println("Month: " + mon);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hr);
        System.out.println("Min: " + min);
        System.out.println("Sec: " + sec);
        
        
        
    }

}
