package DomesticDreamTeam;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Removeworker implements Functions {
    @Override
    public void function(Database database, User user) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter worker name: ");
        String workername = s.next();
        int i = database.getWorker(workername);
        if (i > -1){
            database.removeWorker(i);
            System.out.println("worker removed successfully!");
        } else
            System.out.println("Worker does not exist");
        user.menu(database,user);
    }
}
