public class Skill {

    int skillId;
    String skillName;
    String platform;
    String skillLevel;
    String learningStatus;
    int completionPercentage;

    public Skill(
            int skillId,
            String skillName,
            String platform,
            String skillLevel,
            String learningStatus,
            int completionPercentage) {

        this.skillId = skillId;
        this.skillName = skillName;
        this.platform = platform;
        this.skillLevel = skillLevel;
        this.learningStatus = learningStatus;
        this.completionPercentage = completionPercentage;
    }
    @Override
public String toString() {

    return "ID: " + skillId +
            "\nSkill Name: " + skillName +
            "\nPlatform: " + platform +
            "\nSkill Level: " + skillLevel +
            "\nLearning Status: " + learningStatus +
            "\nCompletion: " + completionPercentage + "%";
}
}