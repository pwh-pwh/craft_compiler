package com.coderpwh.craft_compiler.entity;
/**
 * 一个简单的Token。
 * 只有类型和文本值两个属性。
 */
public interface Token {
    /**
     * Token的类型
     * @return
     */
    public TokenType getType();
    /**
     * Token的类型
     * @return
     */
    public String getText();
}
