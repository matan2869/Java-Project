public class targil6 {
    public static void main(String[] args) {

        String str = "aaaEL";
        System.out.println(secret(str));



    }

    public static boolean secret(String str)
    {
        int i = 0;
        while(i < str.length()/2)
        {
            if (str.charAt(i) < 'a' || str.charAt(i) > 'z')
            {
                return false;
            }
            i++;
        }
        if(str.length()%2!=0) i++;
        while(i < str.length())
        {
            if (str.charAt(i) < 'A' || str.charAt(i) > 'Z')
            {
                return false;
            }
            i++;
        }
        return true;
    }


}
