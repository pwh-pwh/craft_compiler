package com.coderpwh.craft_compiler.entity;

public enum DfaState {
        Initial,

        If, While, Id_if1, Id_if2, Else, Id_else1, Id_else2, Id_else3, Id_else4, Int, Id_int1, Id_int2, Id_int3, Id, GT, GE,
        EQ,LT,LE,OUT,IN,
        Assignment,

        Plus, Minus, Star, Slash,Jing,

        SemiColon,
        LeftParen,
        RightParen,

        IntLiteral,
        StringLiteral,
        StringBegin,
        KU,
        Include,Notes
    }