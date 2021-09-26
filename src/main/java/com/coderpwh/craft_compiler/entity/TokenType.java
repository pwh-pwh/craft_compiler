package com.coderpwh.craft_compiler.entity;
/**
 * Token的类型
 */
public enum TokenType {
    Plus,   // +
    Minus,  // -
    Star,   // *
    Slash,  // /

    GE,     // >=
    GT,     // >
    EQ,     // ==
    LE,     // <=
    LT,     // <
    OUT,   //<<
    IN,    //>>


    SemiColon, // ;
    LeftParen, // (
    RightParen,// )

    Assignment,// =

    If,
    Else,
    Cin,
    While,
    Cout,
    Include,
    Main,
    Jing,

    Int,

    Identifier,     //标识符

    IntLiteral,     //整型字面量
    StringLiteral,   //字符串字面量
    StringBegin,
    KU,              //库文件
    Notes
}
