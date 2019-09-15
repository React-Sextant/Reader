package com.artifex.mupdfdemo;

/**
 * Created by qiaodong on 17-12-4.
 */

public abstract class PassClickResultVisitor {
    public abstract void visitText(PassClickResultText result);
    public abstract void visitChoice(PassClickResultChoice result);
    public abstract void visitSignature(PassClickResultSignature result);
}
