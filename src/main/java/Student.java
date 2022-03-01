public class Student{
    String name;
    String email;

    public Student() {
        this.name = "Student_name";
        this.email = "Student_email";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getReportDetails(){
        return "Student_name: " + name + " Student_email: " + email;


    }

}