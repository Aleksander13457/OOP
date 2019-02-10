package Animal;

class Aplication {

    public static void main(String[] args) {

        Dog dog = new Dog("Max", "Doberman");
        System.out.println(dog);
        dog.eat();
        dog.drink();
    }
}