package DomesticDreamTeam;


import java.util.Scanner;

public class DeleteallData implements Functions{
    @Override
    public void function(Database database, User user){
        Scanner s = new Scanner(System.in);
        System.out.println("Are you sure you want to delete all Data?");
        System.out.println("1.Yes\n2.No\n");
        int i = s.nextInt();
        switch (i){
            case 1:
                database.deleteAllData();
                System.out.println("All Data deleted successfully!");
                break;
            case 2:
                user.menu(database,user);
        }



    }
}
