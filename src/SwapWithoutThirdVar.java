

public class SwapWithoutThirdVar {

    public void swap(int num1, int num2){
        System.out.println("Original Values: num1= "+ num1 + " and num2 = " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Swapped Values: num1= "+ num1 + " and num2 = " + num2);

    }

    public static void main(String[] args) {
        SwapWithoutThirdVar swapWithoutThirdVar = new SwapWithoutThirdVar();
        swapWithoutThirdVar.swap(5,6);
    }
}
