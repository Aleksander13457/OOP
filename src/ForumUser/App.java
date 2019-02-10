package ForumUser;

public class App {
    public static void main(String[] args) {
        ForumUser forumUser = new ForumUser("Martin", "Male", 33, "martin@gmail.com", "martin2000", true, 5);
        System.out.println(forumUser.toString());
    }
}
