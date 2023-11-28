package DomesticDreamTeam;

import DomesticDreamTeam.Category;
import DomesticDreamTeam.Category_type;
import DomesticDreamTeam.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Hireworker implements Functions {
    @Override
    public void function(Database database, User user) {
        System.out.println("Search by Category: ");
        int value = 1;
        Scanner s = new Scanner(System.in);
        for (Category_type type : Category_type.values()){
            System.out.println(value + "." + type);
            value++;
        }
        int i = s.nextInt();

        ArrayList<Category> workersInSelectedCategory = null;

        switch (i){
            case 1:
                workersInSelectedCategory = database.getWorkerByCategory(Category_type.MAID);
                break;
            case 2:
                workersInSelectedCategory = database.getWorkerByCategory(Category_type.DRIVER);
                break;
            case 3:
                workersInSelectedCategory = database.getWorkerByCategory(Category_type.COOK);
                break;
            case 4:
                workersInSelectedCategory = database.getWorkerByCategory(Category_type.PLUMBER);
                break;
            case 5:
                workersInSelectedCategory = database.getWorkerByCategory(Category_type.ELECTRICIAN);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        if (workersInSelectedCategory.isEmpty()) {
            System.out.println("No workers found in the specified category.");
            user.menu(database,user);
        } else {
            System.out.println("Workers in the selected category:");
            for (Category worker : workersInSelectedCategory) {
                System.out.println(worker);
                System.out.println("Enter worker name to hire them(case sensitive): ");
                String wname = s.next();
                if (wname.equals(worker.getName())){
                    database.hiring(worker);
                    System.out.println("Worker hired!");
                }
                else {
                    System.out.println("worker not found!");
                }
            }
            user.menu(database,user);
        }

    }
}
