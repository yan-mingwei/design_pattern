package strategy;

/**
 * 工厂模式与策略模式的结合
 */
public class CashContext {
    CashSuper cs=null;

    public CashContext(String type){
        switch(type){
            case "正常收费" :cs=new CashNormal();
            break;
            case "打8折" : cs=new CashRebate(0.8);
            break;
            case "满减" :cs=new CashReturn(300,100);
            break;
        }
    }

    public double getResult(double money){
        return cs.acceptCash(money);
    }
}
