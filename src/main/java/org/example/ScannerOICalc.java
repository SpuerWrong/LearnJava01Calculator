package org.example;

/**
 * @author 王丽杰
 * @date 2024/10/18
 * @className ScannerOICalc
 * @package org.example
 * @description 用于设计加减乘除的方法
 */
public class ScannerOICalc {
    int i = 0;
    double x = 0.0;
    double sum =0.0;
    double sub = 0.0;
    double mul = 0.0;
    double div = 0.0;
    public double addMath(double number){
        double x = number;
        sum = sum + x;
        return sum;
    }
    public double subtractionMath(double number){
        if(sub==0){
            sub = number;
        }else{
            sub = sub - number;
        }
        return sub;
    }
    public double multiplicationMath(double number){
        if(mul==0){
            mul = number;
        }else{
            mul = mul / number;
        }
        return mul;
    }
    public double divisionMath(double number){
        if(div == 0){
            div = number;
        }else{
            div = div * number;
        }
        return div;
    }
    public void description(){
        System.out.println("欢迎打开Scanner流计算器");
        System.out.println("请输入操作类型");
        System.out.println("1.加法");
        System.out.println("2.减法");
        System.out.println("3.除法");
        System.out.println("4.乘法");
    }
}
