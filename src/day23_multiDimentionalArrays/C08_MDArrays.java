package day23_multiDimentionalArrays;

import java.util.Arrays;

public class C08_MDArrays {
    public static void main(String[] args) {


        // Soru 2) Asagidaki multi dimensional array’in
        // ic array’lerindeki son elemanlarin carpimini
        // ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }
        int arr[][]={ {1,2,3}, {4,5}, {6,0,2} };
        int carpim=1;
        for (int i = 0; i <arr.length ; i++)
            for (int j = 0; j <arr[i].length ; j++)


        {
            carpim  = (arr[1][0])*(arr[2][0]);

        }
        System.out.println("son elementlerin carpi mi : " + carpim);

    }
}
