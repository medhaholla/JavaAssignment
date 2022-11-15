import java.util.HashMap;
import java.util.Scanner;
import java.util.UUID;

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
            switch(command){
                case "storeurl":
                    if(!inputCommandArgs[1].isEmpty()) {
                        urlCountMap.put(inputCommandArgs[1], 0);
                        urlShortUrlMap.put(inputCommandArgs[1], UUID.randomUUID().toString());
                    }
                    break;
                case "get":
                    if(!inputCommandArgs[1].isEmpty() && urlCountMap.containsKey(inputCommandArgs[1])) {
                        int currentCount = urlCountMap.get(inputCommandArgs[1]);
                        urlCountMap.put(inputCommandArgs[1], currentCount + 1);
                        System.out.println(urlShortUrlMap.get(inputCommandArgs[1]));
                    }
                    break;
            }
        }

    }
}