package DomesticDreamTeam;


import java.util.ArrayList;

public class Viewworker implements Functions{
    @Override
    public void function(Database database, User user){
        ArrayList<Category> cat= database.getAllWorkers();
        System.out.println("Worker name\t" + "Gender\t" + "Age\t" + "Experience\t" + "Worker type: ");
        for (Category c : cat){
            System.out.println(c.getName() + "\t" + c.getGender() + "\t" + c.getAge() + "\t" + c.getExperience() + "\t" + c.getType());
        }
        user.menu(database,user);
    }
}
