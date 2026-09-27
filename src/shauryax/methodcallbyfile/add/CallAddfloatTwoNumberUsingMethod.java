package shauryax.methodcallbyfile.add;

public class CallAddfloatTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        AddfloatTwoNumberUsingMethod AddfloatTypeNumber = new AddfloatTwoNumberUsingMethod();
        //Method Call
        AddfloatTypeNumber.FirstAddfloatTypeNumberUsingMethod();   //First Method
        //Method Call
        AddfloatTypeNumber.SecondAddfloatTypeNumberUsingMethod(345f, 654f);   //Second Method
        //Store Method in Variable & Method Call
        float third = AddfloatTypeNumber.ThirdAddfloatTypeNumberUsingMethod();  //Third Method
        System.out.println("The Sum is\t"+ third);
        //Store Method in Variable & Method Call
        float forth = AddfloatTypeNumber.ForthAddfloatTypeNumberUsingMethod(827f, 846f);  //Forth Method
        System.out.println("The Sum is\t"+ forth);

    }
}
