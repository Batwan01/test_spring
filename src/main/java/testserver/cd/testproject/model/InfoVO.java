package testserver.cd.testproject.model;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(id.length()<2)
            throw new IllegalArgumentException("2글자 이상이어야 합니다.");
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
        String regex = "^[_a-z0-9-]+(.[_a-z0-9-]+)*@(?:\\w+\\.)+\\w+$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);
        if (!m.matches()) {
            throw new IllegalArgumentException("이메일 형식 x");
        }
        this.email = email;
    }

    public String getpassword() {
        return password;
    }
    public void setpassword(String password) {
        String regex = "^(?=.*[!@#$%^&*()])(?=.*[A-Z])(?=.*[a-zA-Z])(?=.*[0-9]).*$";
        /*(?=.*[!@#$%^&*()]): 특수문자
        (?=.*[A-Z]): 대문자
        (?=.*[a-zA-Z]): 영문자
        (?=.*[0-9]): 숫자*/
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("비밀번호틀림");
        }
        this.password = password;
    }

    public String getphone() {
        return phone;
    }
    public void setphone(String phone) {
        if (!phone.matches("[0-9]+") || phone.length()>11 || phone.length()<10) {
            throw new IllegalArgumentException("비밀번호틀림");
        }
        this.phone = phone;

    }

    public String getjob() {
        return job;
    }
    public void setjob(String job) {
        if (job.isEmpty()) {
            this.job = "no";
        } else {
            this.job = job;
        }
    }


}


