package com.fairyfromalfeya.everscalesolidityplugin;

import com.intellij.lexer.FlexAdapter;

public class SolidityLexerAdapter extends FlexAdapter {
    public SolidityLexerAdapter() {
        super(new SolidityLexer(null));
    }
}
