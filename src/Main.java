import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("In main page");
        System.out.println("Enter the command");
        Scanner scanner = new Scanner(System.in);
        HashMap<String,Integer> urlCountMap = new HashMap<>();
        HashMap<String,String> urlShortUrlMap = new HashMap<>();

        while(true){
            String inputCommmand = scanner.nextLine();
            String[] inputCommandArgs  = inputCommmand.split("\\s+");
            String command = inputCommandArgs[0];
            if(command.equals("exit")){
                break;
            }
        }

    }
}