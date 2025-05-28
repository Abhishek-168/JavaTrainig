import java.util.HashMap;

class javat28{
    public static void main(String[] args)
    {
    //     String str = "abhishek jain is the only jain in the class";
    //     HashMap<Character, Integer> map = new HashMap<>();
    

    //     char[] arr = str.toCharArray();
    //     for (char i: arr)
    //     {
    //         map.put(i, map.getOrDefault(i, 0)+1);
    //     }
    //     System.out.println(map);

        // String str = "abhishek jain is the only jain in the class";
        // HashMap<String, Integer> map = new HashMap<>();

        // String[] arr = str.split(" ");
        // for (String i: arr)
        // {
        //     map.put(i, map.getOrDefault(i, 0)+1);
        // }
        // System.out.println(map);

        String str = "aabbcddefffghhnm";
        char[] arr = str.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char m : arr)
        {
            map.put(m, map.getOrDefault(m, 0)+1);
        }
        for (char c: arr)
        {
            if (map.get(c)==1)
            {
                System.out.println(c);
                break;
            }
        }
    }
}