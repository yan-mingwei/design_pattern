package strategy;

public class CashReturn extends CashSuper {
    public double moneyCondition;
    public double moneyReturn;

    public CashReturn(double moneyCondition,double moneyReturn){
        this.moneyCondition=moneyCondition;
        this.moneyReturn=moneyReturn;

    }

    @Override
    public double acceptCash(double money) {
        return money-(money/moneyReturn)*moneyReturn;
    }


}
