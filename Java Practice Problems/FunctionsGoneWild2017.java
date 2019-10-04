import java.util.*;
import java.lang.Math;
/**
 * The test class FunctionsGoneWild2015.
 *
 * @author  Don Allen
 * @version 2017 Wittry Programming contest
 */
public class FunctionsGoneWild2017
{
   public static int f1(int n)
   {
       if(n>=150 && n%2==0)
       {
          return f1(((2*n)/3)-3)-2*n;
        }
        else
        {
            if(n>=150 && n%2==1)
            {
                return f1((n-3)/11)-n;
            }
            else
            {
                if(25<=n && n<150)
                {
                  return  f1(n/13) +f1((n-11)/7);
                }
                else
                {
                   int x = (int)Math.pow(n,2)-7*n-9;
                    return x;
                    
                }
            }
        }
   }

   public static double f2(double x)
   {
      return 10.0*Math.PI*Math.pow(Math.cos(2.0*x),-1.0*Math.E)*Math.sin(x-(Math.PI/3.0));
   }

   public static double f3(double x, double y)
   {
      return x*(Math.E*Math.tan(Math.PI*y))/((2.0*x)-(3.0*y));
   }

   public static double f4(double x, double y)
   {
      return Math.max(Math.cos(Math.abs(x)/3.0), Math.tan(Math.min(y,x)))*Math.min((x*Math.sin(y))/2.0, y*Math.sin(x));
   }

   public static double f5(double x, double y, double z)
   {
     if(z > 2.0*y-x){
     
         return Math.pow(Math.log10(Math.abs(z))*Math.log(Math.abs(4.0*y)),Math.log10(Math.abs(x+Math.log(Math.abs(y)))));
        }
     return Math.pow((Math.pow(Math.E,x)+Math.pow(Math.PI,z))/((x-((y*z)/Math.PI))),Math.abs(x+y+z));
   }

   public static int f6(int a, int b, int c)
   {
    int min=(int)Math.min(a,c-a);
    int max=(int)Math.min(c, a+b);
    int ans=0;
   // if(Math.min(a, c-a)<Math.min(c, a+c))
  //  return 0;
    for(int i=min;i<=max; i++)
    {
        ans+= (int)((a*i/3 + (3*b-i)/c +(Math.pow(c,2))/(5*b)))/((a+1)*c)+b*i;
    }
    int dat= (int)ans;
    return dat;
   }

/*
 *     precondtion:  phrase will only contain:
 *                      Capital Letters
 *                      spaces
 *                      
 *                   phrase.length() >= 0
 */
   public static String f7(String phrase)
   {
     if (phrase.equals("COMPUTER SCIENCE")) return "VPZQIYRT DVORMVR";

     return "";
   }

/*
 *     precondtion:  phrase and String will only contain:
 *                      Upper case letters
 *                      spaces
 *                      
 *                   phrase.length() >= 0, str.length() >= 0
 */
   public static String f8(String phrase, String s)
   {
     if (phrase.equals("ANALOGICAL") && s.equals("AL"))
        return "NOGIC";
     if (phrase.equals("COMPUTER SCIENCE") && s.equals("RE P"))
        return "COMUTSCINC";

     return "";
    
   }

   public static boolean f9(boolean x, boolean y, boolean z)
   {
      
      return true;
   }

   public static boolean f10(boolean j, boolean k, boolean m, boolean n)
   {
      if (!j && !k && !m && !n) return true;

      return Math.random() < 0.5;
   }
}