package net.awaken.core;

import java.math.BigDecimal;
import java.util.*;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public interface State {

    /**
     * execution state
     */
    enum Execution {
        /**
         * success
         */
        SUCCESS,
        /**
         * failure
         */
        FAILURE;
    }

    /**
     * Basic Type
     */
    enum WrappedType {
        Literals,
        Numbers,
        Datetime,
        GenericArray,
        Maps,
        Collections,
        Bytes,
        Chars,
        Decimal,
        LiteralsArray,
        GenericList,
        GenericSet,
        Customized;

        public static WrappedType get(Class<?> clazz) {
            if (String.class.isAssignableFrom(clazz)) {
                return Literals;
            } else if (Number.class.isAssignableFrom(clazz)) {
                return Numbers;
            } else if (Date.class.isAssignableFrom(clazz)) {
                return Datetime;
            } else if (Object[].class.isAssignableFrom(clazz)) {
                return GenericArray;
            } else if (Map.class.isAssignableFrom(clazz)) {
                return Maps;
            } else if (Collection.class.isAssignableFrom(clazz)) {
                return Collections;
            } else if (Byte.class.isAssignableFrom(clazz)) {
                return Bytes;
            } else if (Character.class.isAssignableFrom(clazz)) {
                return Chars;
            } else if (BigDecimal.class.isAssignableFrom(clazz)) {
                return Decimal;
            } else if (String[].class.isAssignableFrom(clazz)) {
                return LiteralsArray;
            } else if (List.class.isAssignableFrom(clazz)) {
                return GenericList;
            } else if (Set.class.isAssignableFrom(clazz)) {
                return GenericSet;
            } else {
                return Customized;
            }
        }
    }
}
