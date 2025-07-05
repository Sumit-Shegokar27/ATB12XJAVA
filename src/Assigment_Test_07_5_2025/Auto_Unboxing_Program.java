package Assigment_Test_07_5_2025;

public class Auto_Unboxing_Program {

    public static void main(String[] args) {

        int primitiveInt = 100;
        Integer boxedInt = primitiveInt;

        System.out.println("Autoboxed Integer: " + boxedInt);


        Integer anotherBoxedInt = Integer.valueOf(200);
        int unboxedInt = anotherBoxedInt;

        System.out.println("Unboxed int: " + unboxedInt);


        Integer num1 = 50;
        Integer num2 = 25;
        int sum = num1 + num2;

        System.out.println("Sum: " + sum);
    }
}
