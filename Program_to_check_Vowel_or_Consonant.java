import java.util.*;
class Character{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        char b=sc.next().charAt(0);
        if(b=='a' || b=='e' || b=='i' || b=='o' || b=='u' || b=='A' || b=='E' || b=='i' || b=='O' || b=='U')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}