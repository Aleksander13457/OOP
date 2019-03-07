interface CashMachine {
    void depositMoney(int Value);

    void withdrawMoney(int Value);

    default void initialMessage() {
        System.out.println("Connected to the bank");

    }

    static String finalMessage() {
        return "Disconnected from the bank";
    }
}

class ATMImpl implements CashMachine {

    @Override
    public void depositMoney(int Value) {
        System.out.println("Money has been deposited " + Value + " PLN");
    }

    @Override
    public void withdrawMoney(int Value) {
        System.out.println("Money was withdrawn from the ATM " + Value + " PLN");
    }
}

class ATM {
    public static void main(String[] args) {
        ATMImpl atm = new ATMImpl();
        atm.initialMessage();
        atm.depositMoney(100);
        atm.withdrawMoney(50);
        System.out.println(CashMachine.finalMessage());
    }
}