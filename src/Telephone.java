interface Phone {

    void callTo(String name);

    default void callToMom() {

        System.out.println("I am calling to my mom!");

    }

}

class Mobile implements Phone {

    public void callTo(String name) {

        System.out.println("Calling to " + name);

    }

}

class Telephone
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Mobile mobile = new Mobile();

        mobile.callTo("Adam");

        mobile.callToMom();
    }
}