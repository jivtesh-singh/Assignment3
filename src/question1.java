public class question1
{
    public static void main(String[] args)
    {
        String str1 = new String("Jivtesh");
        String str2 = new String("Jivtesh");
        for (int i = 0; i < str1.length() && i < str2.length(); i++)
        {
            if ((int) str1.charAt(i) == (int) str2.charAt(i))
            {
                continue;
            }
            else
            {

                System.out.println((int) str1.charAt(i) - (int) str2.charAt(i));

            }
        }

    }
}
