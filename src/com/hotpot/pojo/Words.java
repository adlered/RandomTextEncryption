package com.hotpot.pojo;

public class Words {
    /**随机加密法Bean类
     * Random Encryption : BEAN CLASS
     * BY Adler WX/QQ:1101635162
     */
    private static char[] setup;
    private static char[] c;

    public static void setSetup(char[] setup) {
        Words.setup = setup;
    }

    public static void setC(char[] c) {
        Words.c = c;
    }

    public static char[] getSetup() {
        return setup;
    }

    public static char[] getC() {
        return c;
    }
}
