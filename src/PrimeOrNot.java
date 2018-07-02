public class PrimeOrNot {
    public static int prime(int n){
        int count =0;
        for (int i=2;i<n;i++){
            if(n%i==0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 101;
        if(prime(n) ==0){
            System.out.println("Yay!");
        }
        else
            System.out.println("Nope!");

    }
}
