import java.util.*;

/*    for all methods - you get 
StringTokenizer strTok = new StringTokenizer(input);
Stack<?????> s = new Stack<??????>();
Queue<?????> q = new LinkedList<?????>();
plus one other Object

plus a String only to return the result
 */  	

public class MysterySolver4AB implements MysterySolverInterface4AB
{
    /*
     *   required operators for PreFix and Post are:
     *     *, /, +, -, % and ^ (exponent)
     */
    public String mysteryPostFix(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        Stack<String> s = new Stack<String>();
        Queue<String> q = new LinkedList<String>();
        String str="";
        int bill=0;
        while(strTok.hasMoreElements())
        {
            str=""+strTok.nextElement();
            if(str.equals("-"))
            {s.add((0-Integer.parseInt(s.pop())+Integer.parseInt(s.pop()))+"");
                str="";
            }
            if(str.equals("*"))
            {s.add((Integer.parseInt(s.pop())*Integer.parseInt(s.pop()))+"");
                str="";
            }
            if(str.equals("%"))
            {
                bill=Integer.parseInt(s.pop());
                s.add((Integer.parseInt(s.pop()))%bill+"");
                str="";
            }
            if(str.equals("+"))
            {s.add(Integer.parseInt(s.pop())+Integer.parseInt(s.pop())+""); str="";}
            if(str.equals("^"))
            { bill=Integer.parseInt(s.pop());
                s.add(Math.pow(Integer.parseInt(s.pop()),bill)+"");
                str="";
            }
            if(str.equals("/"))
            {
                bill=Integer.parseInt(s.pop());
                s.add((Integer.parseInt(s.pop())/bill)+"");
                str="";
            }
            if(!(str.equals("")))
                s.add(str);
        }
        str=s.pop();
        return str;
    }

    public String mysteryPreFix(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        Stack<String> s = new Stack<String>();
        Queue<String> q = new LinkedList<String>();
        String str="";

        while(strTok.hasMoreElements())
        {
            s.add(""+strTok.nextElement());
        }
        while(!(s.empty()))
        {
            str+=" "+s.pop();
        }
        str=str.substring(1,str.length());
        strTok = new StringTokenizer(str);
        while(strTok.hasMoreElements())
        {
            str=""+strTok.nextElement();
            if(str.equals("-"))
            {s.add((Integer.parseInt(s.pop())-Integer.parseInt(s.pop()))+"");
                str="";
            }
            if(str.equals("*"))
            {s.add((Integer.parseInt(s.pop())*Integer.parseInt(s.pop()))+"");
                str="";
            }
            if(str.equals("%"))
            {

                s.add((Integer.parseInt(s.pop()))%Integer.parseInt(s.pop())+"");
                str="";
            }
            if(str.equals("+"))
            {s.add(Integer.parseInt(s.pop())+Integer.parseInt(s.pop())+""); str="";}
            if(str.equals("^"))
            { 
                s.add(Math.pow(Integer.parseInt(s.pop()),Integer.parseInt(s.pop()))+"");
                str="";
            }
            if(str.equals("/"))
            {

                s.add((Integer.parseInt(s.pop())/Integer.parseInt(s.pop()))+"");
                str="";
            }
            if(!(str.equals("")))
                s.add(str);
        }
        str=s.pop();
        return str;
    }

    public String mysteryP(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        Stack<String> s = new Stack<String>();
        Queue<String> q = new LinkedList<String>();
        String str="1";
        q.add(""+strTok.nextElement());
        int i=0;
        if(Integer.parseInt(input)==1)
        {
            return "2";
        }
        s.add(""+2);
        s.add(""+2);
        while(Integer.parseInt(str)<Integer.parseInt(q.peek()))
        {
            s.add(Integer.parseInt(s.pop())+1+"");
            s.add(""+s.peek());
            str= Integer.parseInt(str)+1+"";
            for(i=2;i<Integer.parseInt(s.peek());i++)
            {   if(Integer.parseInt(s.peek())%i==0)
                {
                    s.pop();
                    str= Integer.parseInt(str)-1+"";
                    break;
                }
            }

        }
        str="";
        s.pop();
        while(!(s.empty()))
        {
            str=" "+Integer.parseInt(s.pop())+str;

        }
        return str.substring(1,str.length());
    }

    public String mysteryS(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        Stack<String> s = new Stack<String>();
        Stack<String> q = new Stack<String>();
        int temp=0;
        String str="";
        while(strTok.hasMoreElements())
        {
            q.add(""+strTok.nextElement());
        }
        while(!(q.empty()))
        {
            temp=Integer.parseInt(q.pop());
            if(s.empty())
            {
                s.add(""+temp);
            }
            else
            {if(Integer.parseInt(s.peek())<=temp)
            {
                s.add(""+temp);
            }
            else
            {
                while(Integer.parseInt(s.peek())>temp)
                {
                    q.add(s.pop());
                    if(s.empty())
                    {
                        s.add(""+temp);
                    }
                }
                if(!(s.peek().equals(""+temp)))s.add(""+temp);
            }}
        }
        while(!(s.empty()))
        {
            str= " " + s.pop() +str;
        }
        return str.substring(1,str.length());
    }  

    /*
     *    See tester for sample input - output
     *    
     *    You may assume the first int < second int.
     *    
     *    You may assume all three ints will be greater than 0
     */  

    public String mystery10(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        /*  Stack<?????> s = new Stack<??????>();
        Queue<?????> q = new LinkedList<?????>();
        plus one other Object
         */  	
        return "";
    }

    public String mysteryC(String input)
    {
        StringTokenizer strTok = new StringTokenizer(input);
        Stack<String> s = new Stack<String>();
        Stack<String> q = new Stack<String>();
        String stringy=strTok.nextElement();
        String str="";
        
        while(stringy.length()>0)
        {
            s.add(stringy.substring(0,1))
            q.add("1");
            stringy=stringy.substring(1,stringy.length());
            while(stringy.substring(0).equal(s.peek())
            {
                
            }
        }
        
        return "";
    }
}