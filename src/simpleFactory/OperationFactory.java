package simpleFactory;

public class OperationFactory {
    public static BaseOperation createOperate(String operate){
        BaseOperation operation=null;
        switch (operate){
            case "+":
                operation=new AddOperation();
                break;
            default:
        }
        return operation;
    }
}
