//Created By 21CE013 ABHI BHIMANI

//WAP to show the try - catch block to catch the different types of exception

//Github Link = https://github.com/abhii14758/JAVA_PRACTICAL_PART_4


package PR_4;

public class PR_4_1{
    public static void main(String[] args) {
        int a=10,b=0;
        int c[] = {1,2,3};

        try{
            System.out.println(a/b);
        }
        catch(Exception e){
            System.out.println("Arithmatic Exception Occured");
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
        try{
            String s = null;
            System.out.println(s.charAt(0));
        }
        catch(Exception e)
        {
            System.out.println("Null Pointer Exception");
        }
    }
}