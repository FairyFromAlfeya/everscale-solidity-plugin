package com.fairyfromalfeya.everscalesolidityplugin;

import com.fairyfromalfeya.everscalesolidityplugin.parser.SolidityParser;
import com.fairyfromalfeya.everscalesolidityplugin.psi.SolidityFile;
import com.fairyfromalfeya.everscalesolidityplugin.psi.SolidityTokenSets;
import com.fairyfromalfeya.everscalesolidityplugin.psi.SolidityTypes;
import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;

public class SolidityParserDefinition implements ParserDefinition {
    public static final IFileElementType FILE = new IFileElementType(SolidityLanguage.INSTANCE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new SolidityLexerAdapter();
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return SolidityTokenSets.COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public PsiParser createParser(final Project project) {
        return new SolidityParser();
    }

    @NotNull
    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new SolidityFile(viewProvider);
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return SolidityTypes.Factory.createElement(node);
    }
}
