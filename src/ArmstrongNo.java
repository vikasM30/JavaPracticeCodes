import static java.lang.Math.*;

public class ArmstrongNo {

    public boolean isArmstrong(int n){
        int count = 0;
        int temp = n;
        int temp2 = n;
        int rem;
        int sum = 0;
        while (n > 0){
            n = n/10;
            count ++;
        }
        while (temp2 > 0){
            rem = temp2 % 10;
            temp2 = temp2 / 10;
            sum = (int) (sum + pow(rem, count));
        }
        return temp == sum;

    }

    public static void main(String[] args) {
        ArmstrongNo armstrongNo = new ArmstrongNo();
        System.out.println(armstrongNo.isArmstrong(13));
    }
}
