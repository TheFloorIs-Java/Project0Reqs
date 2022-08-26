import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Museum {
    public static void main(String[] args) {
        /*
        System.out.println("What's your name?");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Hello, "+name);

         */
        Scanner in = new Scanner(System.in);

        PaintingService paintingService = new PaintingService();
        boolean visitingMuseum = true;
        while(visitingMuseum){
            System.out.println("input command (quit, add, view)");
            String userInput = in.nextLine();
            if(userInput.equals("quit")){
                visitingMuseum = false;
            }else if(userInput.equals("add")){
                System.out.println("insert painting name:");
                String paintingTitle = in.nextLine();
                System.out.println("insert artist name:");
                String artistName = in.nextLine();
                paintingService.addPainting(paintingTitle, 0, artistName);
            }else if(userInput.equals("view")){
                System.out.println(paintingService.getPaintings());
            }
        }
        Service.verifyDBConnection();
    }
}
