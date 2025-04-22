public class Javat17 {
    public static void main(String[] args)
    {
        int[] arr1 = {1, 2,3,4,5};
        int[] arr2 = {2,4,6,8,10};
        
        int sum = 0;
        int[] sumarr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++)
        {
            sum += arr1[i] + arr2[i];
            sumarr[i] = arr1[i] + arr2[i];
        }
        System.out.println("Sum is " + sum);
        for (int j = 0; j < arr1.length; j++)
        {
            System.out.print(sumarr[j] + " ");
        }
        System.out.println();
        arr1 = java.util.Arrays.copyOf(arr1, arr1.length * 2);
        for (int j = arr1.length / 2; j < arr1.length; j++) {
            arr1[j] = arr2[j - arr1.length / 2];
        }
        for (int k = 0; k < arr1.length; k++)
        {
            System.out.print(arr1[k] + " ");
        }


        // Unique Element in 2 arrays
        
    }
}
