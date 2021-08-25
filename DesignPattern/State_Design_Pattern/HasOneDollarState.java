package DesignPattern.State_Design_Pattern;

import org.graalvm.compiler.phases.verify.VerifyDebugUsage;

public class HasOneDollarState implements IState {

    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("Already have one dollar");
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("returning money");
        VendingMachine.setState(/** Vending.getIdleState() */);
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("releasing product");

        if (vendingMachine.getCount()>1) {
            VendingMachine.doReleaseProduct();
            VendingMachine.setState(/** vendingMachine.getIdleState() */);
        }else{
            VendingMachine.doReleaseProduct();
            VendingMachine.setState(/** VendingMachine.getOutofStockState() */);
        }
    }
    
}
