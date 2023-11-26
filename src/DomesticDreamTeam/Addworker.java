package DomesticDreamTeam;


import java.util.ArrayList;
import java.util.Scanner;

public class Addworker implements Functions{

    @Override
    public void function(){
        ArrayList<Category> categories = new ArrayList<>();
        Category category = new Category();
        categories.add(category);
        category.toString();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = s.next();
        category.setName(name);
        System.out.println("Enter gender: ");
        String gender = s.next();
        category.setGender(gender);
        System.out.println("Enter age: ");
        int age = s.nextInt();
        category.setAge(age);
        System.out.println("Enter experience: ");
        String exp = s.next();
        category.setExperience(exp);
        System.out.println("Enter cat type: ");
        for (Category_type type : Category_type.values()){
            System.out.println(type);
        }
        System.out.println("Enter value: ");
        int value = s.nextInt();
        switch (value){
            case 1:
                category.setType(Category_type.MAID);
            case 2:
                category.setType(Category_type.DRIVER);
            case 3:
                category.setType(Category_type.COOK);
            case 4:
                category.setType(Category_type.PLUMBER);
            case 5:
                category.setType(Category_type.ELECTRICIAN);
        }
        category.toString();










    }
}
