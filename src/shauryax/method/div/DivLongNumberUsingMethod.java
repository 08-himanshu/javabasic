package shauryax.method.div;

public class DivLongNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        DivLongNumberUsingMethod DivLongTypeNumber = new DivLongNumberUsingMethod();
        //Method Call
        DivLongTypeNumber.FirstDivLongTypeNumberUsingMethod();    //First Method
        //Method Call
        DivLongTypeNumber.SecondDivLongTypeNumberUsingMethod(364L, 635L);    //Second Method
        //Store Method in Variable & Method Call
        Long third = DivLongTypeNumber.ThirdDivLongTypeNumberUsingMethod();   //Third Method
        System.out.println("The Div is\t" + third);
        //Store Method in Variable & Method Call
        Long forth = DivLongTypeNumber.ForthDivLongTypeNumberUsingMethod(695L, 618L);   //Forth Method
        System.out.println("The Div is\t" + forth);
    }
    //First Method
    public void FirstDivLongTypeNumberUsingMethod() {
        Long num1 = 874L;
        Long num2 = 704L;
        Long div = num1 / num2;
        System.out.println("The Div is\t" + div);
    }
    //Second Method
    public void SecondDivLongTypeNumberUsingMethod(Long firstNumber,Long secondNumber) {
        Long num1 = firstNumber;
        Long num2 = secondNumber;
        Long div = num1 / num2;
        System.out.println("The Div is\t" + div);
    }
    //Third Method
    public Long ThirdDivLongTypeNumberUsingMethod() {
        Long num1 = 734L;
        Long num2 = 563L;
        Long div = num1 / num2;
        return div;
    }
    //Forth Method
    public Long ForthDivLongTypeNumberUsingMethod(Long firstNumber,Long secondNumber) {
        Long num1 = firstNumber;
        Long num2 = secondNumber;
        Long div = num1 / num2;
        return div;
    }
}
