//Vincent Zhao
public class DiverseArray
{
    public static int arraySum(int[] arr)
    {
        int sum = 0;
        for(int i = 0; i<arr.length; i++)
        {
            sum+= arr[i];
        }
        return sum;
    }
    public static int[] rowSums(int[][] arr2D)
    {
        int[] a= new int[arr2D.length];
        int sum=0;
        for(int i=0;i<arr2D.length;i++)
        {
            for(int k=0;k<arr2D[i].length;k++)
            {
                sum+=arr2D[i][k];
            }
            a[i]=sum;
            sum=0;
        }
        return a;

    }
    public static boolean isDiverse(int[][] arr2D)
    {
        int[] sums = rowSums(arr2D);
        for(int i=0; i <sums.length; i++)
        {
            for(int j=i+1; j< sums.length; j++)
            {
                if(sums[i]==sums[j])
                {
                    return false;
                }
            }
        }
        return true;
    }
}
