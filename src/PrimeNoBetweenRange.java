public class PrimeNoBetweenRange {

    public static void getPrime(int a, int b){
        if(a==1){
            a=2;
        }

        for (int i = a;i<=b;i++){
            int count = 0;
            for (int j=2;j<i;j++){
                if(i%j ==0){
                    count++;
                    break;
                }
            }
            if (count == 0){
                System.out.print(i + " ");
            }

        }
    }

    public static void main(String[] args) {
        getPrime(1,100);
    }
}
