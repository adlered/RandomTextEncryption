package com.hotpot.main;

import com.hotpot.service.RandomNum;
import com.hotpot.pojo.Words;

public class Encoding {
    public Encoding(String words) {
        /**随机加密法加密类
         * Random Encryption : ENCRYPTION CLASS
         * BY Adler WX/QQ:1101635162
         *
         * Encrypted code是加密后的数据, Private key用于记录位置数据
         * ENCRYPTED CODE IS ENCRYPTED DATA, PRIVATE KEY FOR RECORD LOCATION DATA
         */
        //遍历字符串
        char[] c = words.toCharArray();
        char temp;
        char[] setup = new char[words.length()]; //记录更改
        for (int i = 0; i <= words.length()-1; i++) {
            Float d1 = Float.valueOf(i);
            Float d2 = Float.valueOf(words.length()-1);
            Float count = (d1 / d2) * 100;
            System.out.println("\n======> ENCODING... " + count + "%");
            int after;//并移动到N位
            System.out.print(i + " : ");
            after = RandomNum.sumIntger(0, words.length()-1, false);
            System.out.println(after);
            temp = c[after]; //两位互换位置
            c[after] = c[i];
            c[i] = temp;
            for (char cha:c) {
                System.out.print(cha);
            }
            setup[i] = (char)(after+48);
        }
        System.out.println("\n======> ENCODING SUCCESSFULL!");
        System.out.println("Result:");
        System.out.println("Encrypted code:");
        for (char cha:c) {
            System.out.print(cha);
        }
        System.out.println();
        System.out.println("Private key:");
        for (char set:setup) {
            System.out.print(set);
        }
        System.out.println();

        //传值给bean
        Words.setC(c); //Encrypted key
        Words.setSetup(setup); //private key
    }
}
