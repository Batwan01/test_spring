package testserver.cd.testproject.model;

public class InfoVO {
    private String id;
    private String name;
    private int age;
    private String email;
    private String password;
    private String phone;
    private String job;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        if(id.length()<2)
            throw new IllegalArgumentException("2글자 이상이어야 합니다.");
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getage() {
        return age;
    }
    public void setage(int age) {
        this.age = age;
    }

    public String getemail() {
        return email;
    }
    public void setemail(String email) {
        this.email = email;
    }

    public String getpassword() {
        return password;
    }
    public void setpassword(String password) {
        this.password = password;
    }

    public String getphone() {
        return phone;
    }
    public void setphone(String phone) {
        this.phone = phone;
    }

    public String getjob() {
        return job;
    }
    public void setjob(String job) {
        this.job = job;
    }

}


