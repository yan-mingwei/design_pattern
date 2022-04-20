package simpleFactory;

public class AddOperation extends BaseOperation{

    @Override
    public double getResult() {
        return getNumberA()+getNumberB();
    }
}
