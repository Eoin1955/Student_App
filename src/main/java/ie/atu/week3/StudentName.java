package ie.atu.week3;

public class StudentName {
    private String name;
    private String email;
    private String course;

    public StudentName() {
        this.name = "";
        this.email = "";
        this.course = "";
    }

    public StudentName(String name) {
        this.name = name;
        this.email = "";
        this.course = "";
    }

    public StudentName(String name, String email) {
        this.name = name;
        this.email = email;
        this.course = "";
    }

    public StudentName(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "StudentName: " +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}

