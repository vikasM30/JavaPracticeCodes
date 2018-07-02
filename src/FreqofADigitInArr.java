public class FreqofADigitInArr {

    public static int freq(int arr[], int n){
        int count = 0;
        for(int i =0; i<arr.length; i++){
            if (arr[i] == n){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int A[] ={7,4,8,5,7,6,2,4,7,9,7,7,1,7,2,7};
        System.out.println(freq(A,2));
    }
}
