package DomesticDreamTeam;

import java.util.Scanner;

public class Exit implements Functions {
    @Override
    public void function(Database database, User user) {
        Scanner s = new Scanner(System.in);
        System.out.println("Are you sure you want to quit the application?");
        System.out.println("1. Yes\n2. No");
        int i = s.nextInt();
        switch (i) {
            case 1:
                database.exit();
                break;
            case 2:
                user.menu(database, user);
                break;
            case 3:
                System.out.println("Enter name:");
                String nameInput = s.next();
                System.out.println("Enter phone number");
                String phoneNumberInput = s.next();
                System.out.println("Enter email: ");
                String emailInput = s.next();
                System.out.println("Enter password");
                String passwordInput = s.next();

                System.out.println("1. Admin");
                System.out.println("2. Normal User");
                int n = s.nextInt();

                switch (n) {
                    case 1:
                        System.out.println("Admin account created");
                        User adminUser = new Admin(nameInput, phoneNumberInput, emailInput, passwordInput);
                        database.addUser(adminUser);
                        break;
                    case 2:
                        System.out.println("Normal user account created");
                        User normalUser = new NormalUser(nameInput, phoneNumberInput, emailInput, passwordInput);
                        database.addUser(normalUser);
                        break;
                }
                break;
        }
    }
}
