package map6ex;

public class Manager {

    private String fullName;
    private int workExperience;
    private String responsibility;

    public Manager() {
    }

    public Manager(String fullName, int workExperience, String responsibility) {
        this.fullName = fullName;
        this.workExperience = workExperience;
        this.responsibility = responsibility;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public String getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }

    @Override
    public String toString() {
        return "MANAGER: " + fullName + ", workExperience " + workExperience +
               " years, responsible for " + responsibility + ".";
    }
}
