package Lap1;
import java.util.Scanner;

public class bai3Lap1 {
    public static void main(String[] args) {
        Float Canh, TheTich;
        System.out.println( "Nhap canh khoi lap phuonng : ");
        Scanner input = new Scanner(System.in);
        Canh = input.nextFloat();
        TheTich = Canh*Canh*Canh;
        System.out.println("The tich khoi lap phuong la : "+ TheTich );
    }
}
    
    

