import java.util.*;

// Write a program to check whehter given String is palindrome or not


class Assignment294
{
    public static boolean Palindrome(String s)
    {
        char arr[] = s.toCharArray();

        boolean flag = true;

        int left = 0;
        int right = arr.length - 1;

        while(left < right)
        {
            if(arr[left] != arr[right])
            {
                flag = false;
                break;
            }

            left++;
            right--;
        }
        
        return flag;
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        String str = null;
        boolean flag = false;
        
        System.out.println("Enter a string : ");
        str = sobj.nextLine();
        str.trim();
        str.replaceAll("\\s+", " ");
        str = str.toLowerCase();

        flag = Palindrome(str);

        if(flag)
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }
    }
}