//Created By 21CE013 ABHI BHIMANI

//Write a program that raises two exceptions. Specify two ‘catch’ clauses for the two exceptions. Each ‘catch’ block handles a different type of exception. For example the exception could be ‘ArithmeticException’ and ‘ArrayIndexOutOfBoundsException’. Display a message in the ‘finally’ block.

//Github Link = https://github.com/abhii14758/JAVA_PRACTICAL_PART_4


import java.util.function.DoubleToIntFunction;

public class PR_4_3{
    public static void main(String[] args) {
        int a=10,b=0;
        int c[] = {1,2,3};
        try{
            System.out.println(a/b);
        }
        catch(Exception e){
            System.out.println("Arithmatic Exception Occured");
        }
        finally{
            System.out.println("Arithmatic Exception Finally Block");
        }
        try{
            for(int i=0;i<4;i++)
            {
                System.out.println(c[i]);
            }
        }
        catch(Exception e)
        {
            System.out.println("Array Index Out Of Bound");
        }
        finally{
            System.out.println("Array Index Finally Block");
        }
    }
}