package lesson5.problem2;

public class Professor extends DeptEmployee{
    private int numberOfPublications;

    public Professor(String name, double salary, String year, String month, String day, int numberOfPublications) {
        super(name, salary, year, month, day);
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }
}
