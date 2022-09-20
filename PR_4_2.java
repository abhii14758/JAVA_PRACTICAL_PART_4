//Created By 21CE013 ABHI BHIMANI

// WAP to generate user defined exception using “throw” and “throws” keyword.


//Github Link = https://github.com/abhii14758/JAVA_PRACTICAL_PART_4


import java.util.*;

class MyException extends Exception
{
    MyException(String s)
    {
        super(s);
    }
}
public class PR_4_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        if(age<18)
        {
            try{
                throw new MyException("Not Eligile");
            }
            catch(MyException e)
            {
                System.out.println(e);
            }
        }
        else{
            System.out.println("You Are Eligible");
        }
        }
}

