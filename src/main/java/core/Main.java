package core;

import stuff.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ea = 49, eb = 25, p = 67;
        int da = Utils.invert(ea, p-1);
        int db = Utils.invert(eb, p-1);;

        Scanner scan = new Scanner(System.in);

        System.out.println("ea = " + ea);
        System.out.println("eb = " + eb);
        System.out.println("p = " + p);
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        System.out.println("da = " + da);
        System.out.println("db = " + db);
        System.out.println("Please Enter Your Message : ");
        String msg = scan.next();

        List<Integer> list = Utils.getNumbers(msg);

        List<Integer> listM1 = new ArrayList<>();
        List<Integer> listM2 = new ArrayList<>();
        List<Integer> listM3 = new ArrayList<>();
        List<Integer> decryptedMsg = new ArrayList<>();

        for (Integer i: list)
        {
            listM1.add(Utils.modPow(i,eb,p));
        }
        for (Integer i: listM1)
        {
            listM2.add(Utils.modPow(i,ea,p));
        }
        for (Integer i: listM2)
        {
            listM3.add(Utils.modPow(i,db,p));
        }
        for (Integer i: listM3)
        {
            decryptedMsg.add(Utils.modPow(i,da,p));
        }
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        System.out.println("m1 = " + listM1);
        System.out.println("m2 = " + listM2);
        System.out.println("m3 = " + listM3);
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        System.out.println("Input msg = " + msg);
        System.out.println("Input list =  " + list);
        System.out.println("Output list = " + decryptedMsg);
        System.out.println("Decrypted msg = " + Utils.getMsg(decryptedMsg));
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");

    }
}
