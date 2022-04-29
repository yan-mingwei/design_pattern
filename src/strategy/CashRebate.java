package strategy;

public class CashRebate extends CashSuper {

    public double moneyRebate;

    public CashRebate(double moneyRebate){
        this.moneyRebate=moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money*moneyRebate;
    }
}
