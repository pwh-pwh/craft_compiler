package com.coderpwh.craft_compiler.entity;

import java.util.HashMap;
import java.util.Map;

public class KeyWorkMap {
    public static Map<String,TokenType> map = new HashMap<>();
    static {
        map.put("while",TokenType.While);
        map.put("if",TokenType.If);
        map.put("int",TokenType.Int);
        map.put("cin",TokenType.Cin);
        map.put("cout",TokenType.Cout);
        map.put("else",TokenType.Else);
        map.put("include",TokenType.Include);
        map.put("main",TokenType.Main);
    }
}
