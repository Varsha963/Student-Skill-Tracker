
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        SkillManager manager = new SkillManager();

        while (true) {

            System.out.println("\n===== Student Skill Tracker =====");

            System.out.println("1. Add Skill");
            System.out.println("2. View Skills");
            System.out.println("3. Update Skill");
            System.out.println("4. Delete Skill");
            System.out.println("5. Search Skill");
            System.out.println("6. View Completed Skills");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    manager.addSkill();
                    break;

                case 2:
                    manager.viewSkills();
                    break;

                case 3:
                    manager.updateSkill();
                    break;

                case 4:
                      manager.deleteSkill();
                    break;

                case 5:
                    manager.searchSkill();
                    break;

                case 6:
                   manager.viewCompletedSkills();
                    break;

                case 7:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}