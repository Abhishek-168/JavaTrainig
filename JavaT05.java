import java.util.HashMap;

public class JavaT05 {
    public static void main(String[] args) {
        // Wrong for this test case
        // String str1 = "abc";
        // String str2 = "aad";

        // int k = 0;
        // char[] arr1 = str1.toCharArray();
        // char[] arr2 = str2.toCharArray();

        // for (char c: arr1)
        // {
        //     k += (int)c;
        // }
        // for (char c: arr2)
        // {
        //     k -= (int)c;
        // }
        // if (k==0)
        // {
        //     System.out.println("Anagram");
        // }
        // else{
        //     System.out.println("Not an Anagram");
        // }


        // String str1 = "elloh";
        // String str2 = "hello";

        // char[] arr1 = str1.toCharArray();
        // char[] arr2 = str2.toCharArray();

        // HashMap <Character, Integer> map = new HashMap<>();

        // for (char c: arr1)
        // {
        //      map.put(c, map.getOrDefault(c, 0)+1);
        // }
        // for (char m: arr2)
        // {
        //      map.put(m, map.getOrDefault(m, 0)-1);
        // }
        // boolean k = true;
        // for (Character key : map.keySet()) {
        //     if (map.get(key) != 0) {
        //     k = false;
        //     break;
        //     }
        // }
        
        // System.out.println(k ? "Anagram" : "Not an Anagram");



        int[][] arr = { {1,2,3}, {4, 5, 6}, {7, 8, 9}};
        int x = 0;
        int y = 0;
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                x = (i+j)%3;
            }
        }
    }
}


