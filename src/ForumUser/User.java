package ForumUser;

public class User {
    private String name;
    private String sex;
    private int age;
    private String mailAdress;

    public User(String name, String sex, int age, String mailAdress) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.mailAdress = mailAdress;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getMailAdress() {
        return mailAdress;
    }

    void userLogin() {
    }

    void deletionOfTheAccount() {
    }
}
