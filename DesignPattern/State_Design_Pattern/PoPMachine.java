package DesignPattern.State_Design_Pattern;

public class PoPMachine {
    private IState IdleState;
    private IState hasOneDollar;
    private IState outOfStock;

    private IState currState;
    private int count;

    public PoPMachine(int count){
        IdleState = new IdleState();
        hasOneDollar = new HasOneDollarState();
        outOfStock = new OutofStock();

        if (count>0) {
            currState = IdleState;
            this.count = count;
        }else{
            currState = outOfStock;
            this.count = 0;
        }
    }
}
