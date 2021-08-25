package DesignPattern.State_Design_Pattern;



public interface IState {
    public void insertDollar(VendingMachine vendingMachine);
    public void ejectMoney(VendingMachine vendingMachine);
    public void dispense(VendingMachine vendingMachine);
}
