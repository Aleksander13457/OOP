class UserValidator {
    public boolean validateAge(int age) {

        if (age <= 15) {
            System.out.println("Too young!");
            return false;
        } else {
            System.out.println("User age is okey!");
            return true;
        }
    }

    public void validateSex(char sex) {

        if (sex == 'm') {
            System.out.println("User is a male");
        } else if (sex == 'f') {
            System.out.println("User is a female");
        } else {
            System.out.println("Unknown sex!");
        }
    }
}
class Application {
    public static void main(String[] args) throws java.lang.Exception {
        System.out.println("Starting...");

        int age = 17;
        char sex = 'm';

        UserValidator validator = new UserValidator();

        boolean isHigherThanFifteen = validator.validateAge(age);

        if (isHigherThanFifteen) {
            validator.validateSex(sex);
        }

        System.out.println("End of the program");
    }
}