package com.fairyfromalfeya.everscalesolidityplugin;

import com.fairyfromalfeya.everscalesolidityplugin.psi.SolidityTypes;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class SoliditySyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey SEPARATOR = createTextAttributesKey("SOLIDITY_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey KEY = createTextAttributesKey("SOLIDITY_KEY", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey VALUE = createTextAttributesKey("SOLIDITY_VALUE", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey COMMENT = createTextAttributesKey("SOLIDITY_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER = createTextAttributesKey("SOLIDITY_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] SEPARATOR_KEYS = new TextAttributesKey[]{SEPARATOR};
    private static final TextAttributesKey[] KEY_KEYS = new TextAttributesKey[]{KEY};
    private static final TextAttributesKey[] VALUE_KEYS = new TextAttributesKey[]{VALUE};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new SolidityLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(SolidityTypes.SEPARATOR)) { return SEPARATOR_KEYS; }
        if (tokenType.equals(SolidityTypes.KEY)) { return KEY_KEYS; }
        if (tokenType.equals(SolidityTypes.VALUE)) { return VALUE_KEYS; }
        if (tokenType.equals(SolidityTypes.COMMENT)) { return COMMENT_KEYS; }
        if (tokenType.equals(TokenType.BAD_CHARACTER)) { return BAD_CHAR_KEYS; }

        return EMPTY_KEYS;
    }
}
