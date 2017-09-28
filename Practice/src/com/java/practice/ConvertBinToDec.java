package com.java.practice;
public class ConvertBinToDec {
	 
    public static int ConvertBinaryToDecimal(int binary){
         
        int decimal = 0;
        int power = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int tmp = binary%10;
                //2(Power 0)+ 2(Power 1)+--- so on
                decimal += tmp*Math.pow(2, power);
                binary = binary/10;
                power++;
            }
        }
        return decimal;
    }
    
    public static void main(String args[]){
        System.out.println("1111's Decimal is : "+ConvertBinToDec.ConvertBinaryToDecimal(1111));
        System.out.println("110001's Decimal is  : "+ConvertBinToDec.ConvertBinaryToDecimal(110001));
       
    }
}