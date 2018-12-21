package com.hotpot.main;

import com.hotpot.pojo.Words;

public class Main {
    public static void main(String[] args) {
        /**随机加密法测试类
         * Random Encryption : TEST CLASS
         * BY Adler WX/QQ:1101635162
         */
        //execute encoding
        String needToEncode = "加密ENcryptionTest_!@#$%^&*(123)测试";
        Encoding encoding = new Encoding(needToEncode);
        Decoding decoding = new Decoding();
        /**你还可以自定义加密后文本和解密钥匙
         * 然后调用Decoding类进行解密
         * U CAN ALSO CUSTOMIZE ENCRYPTED CODE AND PRIVATE KEY
         * AND THEN CAL; DECODING CLASS TO DECODING
         */
        //如果为true, 可以自定义解密数据
        //IF ITS TRUE, U CAN CUSTOMIZE DECODING DATA.
        boolean customize = false;
        if (customize == true) {
            //Set code
            String c = "&.^&@w#&_$xhtwwer_tnieo测cmwe试";
            //Set decode key
            String setup = "19941857677522748816393769204";
            //Convert to charArray
            char[] setup2 = setup.toCharArray();
            char[] c2 = c.toCharArray();
            //Set to bean
            Words.setSetup(setup2);
            Words.setC(c2);
        }
        //Get result
        String result;
        result = decoding.result();
        System.out.println("\nDecode result:\n" + result);
    }
}
