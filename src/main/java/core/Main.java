package core;

import stuff.Utils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String msg = "zikunov";

        List<Integer> list = Utils.getNumbers(msg);

        int ea = 49, eb = 25, p = 67, da = 31, db = 37;

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
