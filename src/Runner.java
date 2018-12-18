public class Runner {
    public static void main(String[] args)
    {
        int [] arr={0,1,1,1,1,11,1,1,1,1,1,1,1,1,5,10,1,1,1,1,11,1,1,1,1,1,1,1,1,1};
        int[][] arr4= new int[][]{
                {10, 20, 30},
                {10, 20, 60}
        };

        DiverseArray a1 = new DiverseArray();
        System.out.println("arraySum output: "+a1.arraySum(arr));
        int[] output2= a1.rowSums(arr4);
        System.out.print("rowSuns output:");
        for(int i = 0; i<output2.length; i++)
        {
            System.out.print(output2[i]+",");
        }

        System.out.println("\n"+"isDiverse Output: "+a1.isDiverse(arr4));

    }
}
