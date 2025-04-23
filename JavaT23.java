public class JavaT23 {
    public static void main(String[] args)
    {
        // Removing duplicates from string
        // String name = "nazar";
        // String res = "";
        // for (int i = 0; i < name.length(); i++)
        // {
        //     if (res.indexOf(name.charAt(i))==-1)
        //     {
        //         res += name.charAt(i);
        //     }
        // }
        // System.out.println(res);

        // Findinf 1st repeated char in string
        String s = "helolo";
        String k = "";
        boolean a = true;
        for (int j = 0; j  < s.length(); j++)
        {
            if (k.indexOf(s.charAt(j)) != -1)
            {
                if (a)
                {
                    a = false;
                    continue;
                }
                System.out.println(s.charAt(j));
                break;
                
            }
            k += s.charAt(j);
        }
    }
    
}
