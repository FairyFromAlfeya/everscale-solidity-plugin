package com.fairyfromalfeya.everscalesolidityplugin.psi;

import com.intellij.psi.tree.TokenSet;

public interface SolidityTokenSets {
    TokenSet IDENTIFIERS = TokenSet.create(SolidityTypes.KEY);
    TokenSet COMMENTS = TokenSet.create(SolidityTypes.COMMENT);
}
