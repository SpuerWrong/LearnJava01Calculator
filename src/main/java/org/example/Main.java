package org.example;

import java.util.Scanner;

/**
 * @author superwrong
 * @date 2024/10/18
 * @className ${NAME}
 * @package org.example
 * @description ${DESCRIPTION}
 */
//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        ScannerOICalc calc = new ScannerOICalc();
        Scanner number = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        calc.description();
        int i = number.nextInt();
        while(i!=0)
            if(i<5&&i>0){
                switch (i) {
                    case 1:
                        System.out.println("输入数字进行加法运算，输入非数字进行最终结算");
                        while (scan.hasNextDouble()) {
                            double sum = calc.addMath(scan.nextDouble());
                            System.out.println("当前合计为：" + sum);
                        }
                        System.out.println("当前总和为："+calc.sum);
                        break;
                    case 2:
                        System.out.println("输入数字进行减法运算，输入非数字进行最终结算");
                        while(scan.hasNextDouble()){
                            double sub =calc.subtractionMath(scan.nextDouble());
                            System.out.println("当前计算结果为："+sub);
                        }
                        System.out.println("最终减法运算结果为："+calc.sub);
                        break;
                    case 3:
                        System.out.println("输入数字进行除法运算，输入非数字进行最终结算");
                        while(scan.hasNextDouble()){
                            double mul = calc.multiplicationMath(scan.nextDouble());
                            System.out.println("当前计算结果为："+mul);
                        }
                        System.out.println("最终除法运算结果为："+calc.mul);
                        break;
                    case 4:
                        System.out.println("输入数字进行乘法运算，输入非数字进行最终结算");
                        while(scan.hasNextDouble()){
                            double div = calc.divisionMath(scan.nextDouble());
                            System.out.println("当前计算结果为："+div);
                        }
                        System.out.println("最终乘法运算结果为："+calc.div);
                        break;
                }
            }else{
                System.out.println("输入错误");
            }


    }
}