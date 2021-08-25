package DesignPattern.State_Design_Pattern;



public class IdleState implements IState  {

    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("dollar inserted");
        VendingMachine.setState(/*calling vendingMachine.getHasOneDollarState()*/);
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("no money to return");
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("Payment required");
    }

    
    
}
