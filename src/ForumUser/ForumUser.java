package ForumUser;

class ForumUser extends User {
    private String nickName;
    private boolean log;
    private int numbersOfPosts;

    public ForumUser(String name, String sex, int age, String mailAdress, String nickName, boolean log, int numbersOfPosts) {
        super(name, sex, age, mailAdress);
        this.nickName = nickName;
        this.log = log;
        this.numbersOfPosts = numbersOfPosts;
    }

    @Override
    public String toString() {
        return "Name " + getName() + ", sex " + getSex() + ", age " + getAge() + ", mail adress " + getMailAdress() +
                ", nick name " + getNickName() + ", log " + log + ", number of posts " + getNumbersOfPosts();
    }

    void commentsInPosts() {
    }

    public String getNickName() {
        return nickName;
    }

    public boolean isLog() {
        return log;
    }

    public int getNumbersOfPosts() {
        return numbersOfPosts;
    }
}