package org.example.Practise_Java_Code.ReverseGivenStrinValue;

public class Reverse {
    public static void main(String args[]){


        String a = reverse("GOD");
        System.out.println("Step 01 -:"+a);



        String b = reverse02("123");
        System.out.println("Step 02 -:"+b);


        String name = "a";
        name+='b';

        System.out.println(name);

    }

    // step 01

    public static String reverse(String s){

        // need o reverse DOG into GOD
        // implement this on reverse method

        char[] ar = new char[s.length()]; // array lenght 3

        for (int i = 0 ; i < ar.length; i++){

            ar[i] = s.charAt(i);

        }


        String reverse = "";
        for(int i=ar.length ; i > 0 ; i-- ){

            int arrayIndex = i - 1;

            reverse = reverse + ar[arrayIndex];

        }

        return reverse;
    }

    // Step 02
    public static String reverse02(String a){


        String reverse = "";
        char[] ar = new char[a.length()]; // array lenght 3

        int index = 0;
        for (int i = ar.length ; i > 0; i--){

            ar[index] = a.charAt(i-1);

            reverse += ar[index];

            index++;

        }

        return reverse;



    }

}
