package day23_arrays;

public class C02_MDArrays {
    public static void main(String[] args) {

        //verilen MDA nin tum elementlerinin toplami nedir


        int arr[][]={{3,1,7,5},{6,10}};

        int toplam=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                toplam +=arr[i][j];

            }

        }  System.out.println(toplam);

    }
}
