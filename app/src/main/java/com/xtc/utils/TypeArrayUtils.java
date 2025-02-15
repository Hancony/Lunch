package com.xtc.utils;

import android.content.res.TypedArray;

public class TypeArrayUtils {
    public static boolean optBoolean(TypedArray typedArray, int i, boolean z) {
        return typedArray == null ? z : typedArray.getBoolean(i, z);
    }
}