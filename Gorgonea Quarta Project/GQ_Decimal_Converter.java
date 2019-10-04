import java.util.*;
/**
 * Write a description of class GorgoneaQuarta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GQ_Decimal_Converter
{
    public static int toDecimal(String str)
    {
        return 11;
    }

    public static String toGQ(int num)
    {   int mahNumber=0;
        int defnum=Math.abs(num);
        String str="";
        int power= 0;
        while(Math.pow(3,power)<defnum)
        {
            power++;
        }
        power=power-1;
        //double pow=Math.floor(Math.log(defnum)/Math.log(3));
        //int power= (int)pow;
        while(power>-1)
        {
            int diff=(int)Math.pow(3,power+1);
            int lower=mahNumber-diff;
            int higher=mahNumber+diff;
            int same= mahNumber;
            if((Math.abs(lower-defnum))<Math.abs(higher-defnum)&&(Math.abs(lower-defnum)<Math.abs(same-defnum)))
            {str=str+"a"; mahNumber=lower;}
            else
            {
                if((Math.abs(lower-defnum))>Math.abs(higher-defnum)&&(Math.abs(higher-defnum)<Math.abs(same-defnum)))
                {str=str+"b"; mahNumber=higher;}
                else
                {str=str+"c";}
            }
            System.out.print("k");
            power--;
        }
        if(num<0){ 
            return str.replaceAll("a","1").replaceAll("b","-").replaceAll("c","0");}
        else{
            return str.replaceAll("a","-").replaceAll("b","1").replaceAll("c","0");
        }
    }

   
}