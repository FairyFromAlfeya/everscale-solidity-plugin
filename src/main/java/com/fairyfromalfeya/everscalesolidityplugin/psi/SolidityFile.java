package com.fairyfromalfeya.everscalesolidityplugin.psi;

import com.fairyfromalfeya.everscalesolidityplugin.SolidityFileType;
import com.fairyfromalfeya.everscalesolidityplugin.SolidityLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class SolidityFile extends PsiFileBase {
    public SolidityFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, SolidityLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return SolidityFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Solidity File";
    }
}
