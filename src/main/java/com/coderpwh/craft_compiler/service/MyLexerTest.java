package com.coderpwh.craft_compiler.service;

import com.coderpwh.craft_compiler.entity.Token;

import java.util.regex.Pattern;

import static com.coderpwh.craft_compiler.service.SimpleLexer.dump;

public class MyLexerTest {
    public static void main(String[] args) {
        String t1 = "while";
        String t2 = "while";
        boolean matches = Pattern.matches(t1, t2);
        System.out.println(matches);
        SimpleLexer lexer = new SimpleLexer();
        String script = "int age = 45;\na >= 10 while";
        System.out.println("parse :" + script);
        SimpleTokenReader tokenReader = lexer.tokenize(script);
        dump(tokenReader);


    }
}
