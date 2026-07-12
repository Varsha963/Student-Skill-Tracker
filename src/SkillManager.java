import java.util.ArrayList;
import java.util.Scanner;

public class SkillManager {

    ArrayList<Skill> skills = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

   public void addSkill() {

    System.out.print("Enter Skill ID: ");
    int skillId = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter Skill Name: ");
    String skillName = sc.nextLine();

    System.out.print("Enter Platform: ");
    String platform = sc.nextLine();

    System.out.print("Enter Skill Level: ");
    String skillLevel = sc.nextLine();

    System.out.print("Enter Learning Status: ");
    String learningStatus = sc.nextLine();

   int completionPercentage = 0;

    try {

         System.out.print("Enter Completion Percentage: ");
         completionPercentage = sc.nextInt();

         } catch (Exception e) {

             System.out.println("Please enter numbers only.");

             sc.nextLine();

            return;
    }

    Skill skill = new Skill(
            skillId,
            skillName,
            platform,
            skillLevel,
            learningStatus,
            completionPercentage
    );

    skills.add(skill);

    System.out.println("Skill added successfully!");
}


    public void viewSkills() {

        if (skills.isEmpty()) {
            System.out.println("No skills found.");
            return;
        }

        for (Skill skill : skills) {

            System.out.println("---------------------");

            System.out.println(skill);
        }
    }

    public void searchSkill() {

        sc.nextLine();

        System.out.print("Enter skill name to search: ");

        String name = sc.nextLine();

        boolean found = false;

        for (Skill skill : skills) {

            if (skill.skillName.equalsIgnoreCase(name)) {

                System.out.println("ID: " + skill.skillId);
                System.out.println("Skill Name: " + skill.skillName);
                System.out.println("Platform: " + skill.platform);
                System.out.println("Skill Level: " + skill.skillLevel);
                System.out.println("Learning Status: " + skill.learningStatus);
                System.out.println("Completion: " + skill.completionPercentage + "%");

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Skill not found.");
        }
    }
    public void deleteSkill(){
        sc.nextLine();
        System.out.println("Enter Skill name to delete");
        String name=sc.nextLine();
        boolean found = false;

        for (Skill skill : skills) {

            if (skill.skillName.equalsIgnoreCase(name)) {
                skills.remove(skill);
                System.out.println("Deleted Successfully");
                found=true;
               break;
            }
        }

     if (!found) {
        System.out.println("Skill not found.");
    }
    }
    public void updateSkill() {

    sc.nextLine();

    System.out.print("Enter skill name to update: ");

    String name = sc.nextLine();

    boolean found = false;

    for (Skill skill : skills) {

        if (skill.skillName.equalsIgnoreCase(name)) {

            System.out.print("Enter new skill level: ");
            skill.skillLevel = sc.nextLine();

            System.out.print("Enter new learning status: ");
            skill.learningStatus = sc.nextLine();

            System.out.print("Enter new completion percentage: ");
            skill.completionPercentage = sc.nextInt();

            System.out.println("Skill updated successfully!");

            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println("Skill not found.");
    }
}
public void viewCompletedSkills() {

    boolean found = false;

    for (Skill skill : skills) {

        if (skill.completionPercentage == 100) {

            System.out.println("---------------------");

            System.out.println("ID: " + skill.skillId);
            System.out.println("Skill Name: " + skill.skillName);
            System.out.println("Platform: " + skill.platform);
            System.out.println("Skill Level: " + skill.skillLevel);
            System.out.println("Learning Status: " + skill.learningStatus);
            System.out.println("Completion: " + skill.completionPercentage + "%");

            found = true;
        }
    }

    if (!found) {
        System.out.println("No completed skills found.");
    }
}
}