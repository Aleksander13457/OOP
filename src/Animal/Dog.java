package Animal;

class Dog extends Animal {
    private String raceOfDog;

    public Dog(String nameOfAnimal, String raceOfDog) {
        super(nameOfAnimal);
        this.raceOfDog = raceOfDog;
    }

    void eat() {
    }

    void drink() {
    }

    public String getRaceOfDog() {
        return raceOfDog;
    }

    @Override
    public String toString() {
        return "Race of dog " + getRaceOfDog() + ", " + "name of dog " + getNameOfAnimal() + ".";
    }
}