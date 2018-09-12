public class FreqofEachDigitInaNo {
    public static void main(String[] args) {
        String a ="abaracadabra";
        int count=1;
        char[] ab = a.toCharArray();
        for (int i=0;i<ab.length;i++)
        {
            if (ab[i]>='A' && ab[i]<='z')
            {
                count = 1;
                for (int j=i+1;j<ab.length;j++) {
                    if (ab[i] == ab[j]) {
                        count++;
                        ab[j] = '0';
                    }

                }
                System.out.println("Occurance of "+ab[i]+" is "+count+" times");
            }

        }
    }

}
