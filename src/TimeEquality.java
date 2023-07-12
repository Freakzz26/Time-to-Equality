import java.util.Scanner;
class Equality
{
    void minimumTime(int array[],int n)
    {
        int result=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(array[i]>max)
            {
                max=array[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            result=Math.abs(array[i]-max);
            sum=sum+result;
        }
        System.out.println(sum);
    }
}
public class TimeEquality {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=scanner.nextInt();
        int array[]=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
            array[i]= scanner.nextInt();
        }
        Equality equality=new Equality();
        equality.minimumTime(array,n);
    }
}
