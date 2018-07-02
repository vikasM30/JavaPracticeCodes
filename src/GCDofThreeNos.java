public class GCDofThreeNos {

    public static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a, a);
    }

    public static int getGCD(int arr[], int n){
        int result = arr[0];
        for(int i = 0; i<arr.length; i++){
            result = gcd(arr[i],result);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {10,100,60};
        System.out.println(getGCD(arr,arr.length));
    }
}
