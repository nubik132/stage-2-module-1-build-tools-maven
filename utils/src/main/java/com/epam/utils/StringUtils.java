package com.epam.utils;
import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return NumberUtils.isCreatable(str) && Float.parseFloat(str) > 0;
    }
}
