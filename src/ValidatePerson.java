class ValidatePerson {
    private String name;
    private double age;
    private double height;

    public ValidatePerson(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public ValidatePerson() {
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    boolean hasName(String name) {
        if (name != null) {
            System.out.println("Your name " + name);
            return true;
        } else {
            System.out.println("You did not give your name");
            return false;
        }
    }

    public void validateAge(double age, double height) {
        if (age > 30 && height > 160) {
            System.out.println("User is older than 30 and higher then 160cm");
        } else {
            System.out.println("User is younger than 30 or lower than 160cm");
        }
    }
}

class App {
    public static void main(String[] args) {

        ValidatePerson person = new ValidatePerson("Stefan",40,172);


        if (person.hasName(person.getName())) {
            person.validateAge(person.getAge(), person.getHeight());
        }

    }
}
