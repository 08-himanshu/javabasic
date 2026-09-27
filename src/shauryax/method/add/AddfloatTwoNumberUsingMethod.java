package shauryax.method.add;

public class AddfloatTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        AddfloatTwoNumberUsingMethod AddFloatTypeNumber = new AddfloatTwoNumberUsingMethod();
        //Method Call
        AddFloatTypeNumber.FirstAddFloatTypeNumberUsingMethod();   //First Method
        //Method Call
        AddFloatTypeNumber.SecondAddFloatTypeNumberUsingMethod(345f, 654f);   //Second Method
        //Store Method in Variable & Method Call
        float third = AddFloatTypeNumber.ThirdAddFloatTypeNumberUsingMethod();  //Third Method
        System.out.println("The Sum is\t"+ third);
        //Store Method in Variable & Method Call
        float forth = AddFloatTypeNumber.ForthAddFloatTypeNumberUsingMethod(827f, 846f);  //Forth Method
        System.out.println("The Sum is\t"+ forth);

    }
    //First Method
    public void FirstAddFloatTypeNumberUsingMethod(){
        float num1 = 829f;
        float num2 = 827f;
        float sum = num1 + num2;
        System.out.println("The Sum is\t" + sum);
    }
    //Second Method
    public void SecondAddFloatTypeNumberUsingMethod(float firstNumber,float secondNumber){
        float num1 = firstNumber;
        float num2 = secondNumber;
        float sum = num1 + num2;
        System.out.println("The Sum is\t" + sum);
    }
    //Third Method
    public float ThirdAddFloatTypeNumberUsingMethod() {
        float num3 = 928f;
        float num4 = 826f;
        float sum = num3 + num4;
        return sum;
    }
    //Forth Method
    public float ForthAddFloatTypeNumberUsingMethod(float firstNumber,float secondNumber){
        float num1 = firstNumber;
        float num2 = secondNumber;
        float sum = num1 + num2;
        return sum;
    }
}