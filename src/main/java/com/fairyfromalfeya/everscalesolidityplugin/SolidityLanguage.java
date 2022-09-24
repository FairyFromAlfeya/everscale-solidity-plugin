package com.fairyfromalfeya.everscalesolidityplugin;

import com.intellij.lang.Language;

public class SolidityLanguage extends Language {
    public static final SolidityLanguage INSTANCE = new SolidityLanguage();

    private SolidityLanguage() {
        super("Solidity");
    }
}
