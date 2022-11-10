import java.util.Scanner;

public class Bob {
    public static void main(String [] args){
        Scanner bobTalk = new Scanner(System.in);

        System.out.print("Say something to Bob : ");
        String talkToBob = bobTalk.nextLine();

        System.out.println("You said : \"" + talkToBob + "\"");

        switch (talkToBob.charAt(talkToBob.length() -1)) {
            case '?' :
                System.out.println("Bob says \"Sure.\"");
                break;
            case '!' :
                System.out.println("Bob says \"Woah, chill out!\"");
                break;
            case ' ' :
                System.out.println("Bob says \"Fine. Be that way!\"");
                break;
            default :
                System.out.println("Bob says \"Whatever.\"");
        }
    }
}
