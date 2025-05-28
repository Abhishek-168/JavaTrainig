public class JavatT21 {
    public static void main (String[] args)
    {
        String str = "aaafffbbccc ";
        StringBuilder res = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length()-1; i++)
        {
            if (str.charAt(i)==str.charAt(i+1))
            {
                count++;
                continue;
            }
            res.append(str.charAt(i)).append(count);
            count = 1;
        }
        // res.append(str.charAt(str.length()-1)).append(count);
        System.out.println(res);
    }
}
