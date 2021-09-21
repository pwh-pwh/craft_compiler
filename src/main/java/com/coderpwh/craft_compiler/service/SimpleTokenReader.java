package com.coderpwh.craft_compiler.service;

import com.coderpwh.craft_compiler.entity.Token;

import java.util.List;

final public class SimpleTokenReader implements TokenReader{
    private List<Token> tokenList;
    private int position = 0;

    public SimpleTokenReader(List<Token> tokenList) {
        this.tokenList = tokenList;
    }

    public List<Token> getTokenList() {
        return tokenList;
    }

    @Override
    public Token read() {
        if(position<tokenList.size()) {
            return tokenList.get(position++);
        }
        return null;
    }

    @Override
    public Token peek() {
        if(position<tokenList.size()){
            return tokenList.get(position);
        }
        return null;
    }

    @Override
    public void unread() {
        if(position > 0) {
            position--;
        }else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public int getPosition() {
        return position;
    }

    @Override
    public void setPosition(int position) {
        if(position>0 && position<tokenList.size()){
            this.position = position;
        }else {
            throw new IllegalArgumentException();
        }
    }
}
