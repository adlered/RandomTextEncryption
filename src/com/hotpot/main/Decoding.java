package com.hotpot.main;

import com.hotpot.pojo.Words;

public class Decoding {
    public String result() {
        /**随机加密法解密类
         * Random Encryption : DECRYPTION CLASS
         * 如果debugMode为true, 会在控制台显示调试信息
         * If debugMode is true, console will display debug imformation
         * BY Adler WX/QQ:1101635162
         */
        boolean debugMode = false;
        char[] setup = Words.getSetup();
        char[] c = Words.getC();
        char temp;
        char set;
        System.out.println("\n======> DECODING");
        if (debugMode == true) {
            System.out.println("Code is:");
            for (char c1 : c) {
                System.out.print(c1);
            }
            System.out.println("\nKey is:");
            for (char setup1 : setup) {
                System.out.print(setup1);
            }
            System.out.println();
            System.out.println("Counting...");
        }
        for (int i = setup.length-1; i >= 0; i--) {
            temp = c[i];
            set = setup[i];
            int iset = set - '0';
            if (debugMode == true) {
                System.out.print(set);
                System.out.println(iset);
            }
            c[i] = c[iset];
            c[iset] = temp;
        }
        System.out.println("======> DECODING SUCCESSFUL!");
        String result = String.valueOf(c);
        return result;
    }
}
