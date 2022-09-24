package com.fairyfromalfeya.everscalesolidityplugin.psi;

import com.fairyfromalfeya.everscalesolidityplugin.SolidityLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class SolidityTokenType extends IElementType {
    public SolidityTokenType(@NotNull @NonNls String debugName) {
        super(debugName, SolidityLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "SolidityTokenType." + super.toString();
    }
}
