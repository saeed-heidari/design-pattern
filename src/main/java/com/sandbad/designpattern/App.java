package com.sandbad.designpattern;

import com.gitabin.common.security.CryptoUtils;

public class App {

    public static void main(String[] args) {
        String token = CryptoUtils.getHmacSha256Base64(
                CryptoUtils.sha256("09359450963" + "ih8jwq965TY2" + "1657606298000")
                        + CryptoUtils.sha256("CCG46DIIAG0DF1IO000000G=" + "1663058742784" + "6789047541")
                , "94591");
        System.out.println(token);
    }
}
