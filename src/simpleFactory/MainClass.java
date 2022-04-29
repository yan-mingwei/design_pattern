package simpleFactory;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("请输入数字A");
        Scanner sc=new Scanner(System.in);
        String strNumberA=sc.nextLine();  //算法题不能缺呀
        System.out.println("请输入运算符");
        String operate =sc.nextLine();
        System.out.println("请输入数字B");
        String strNumberB=sc.nextLine();

        BaseOperation operation =OperationFactory.createOperate(operate);
        operation.setNumberA(Double.parseDouble(strNumberA));
        operation.setNumberB(Double.parseDouble(strNumberB));

        System.out.println(operation.getResult());
    }


}

//测试git