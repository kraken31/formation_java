package com.aurelien.formation;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Test {
    public static void main(String[] args) {
        Patisserie pat = new CoucheChocolat(
                new CoucheCaramel(
                        new CoucheBiscuit(
                                new CoucheChocolat(
                                        new Gateau()
                                )
                        )
                )
        );
        System.out.println(pat.preparer());
    }
}
