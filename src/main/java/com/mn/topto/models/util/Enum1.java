package com.mn.topto.models.util;

import java.util.stream.Stream;

public enum Enum1 {
    LOW("100"), MEDIUM("200"), HIGH("300");

    private String code;

    private Enum1(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

//    private int priority;

//    Enum1(int priority) {
//        this.priority = priority;
//    }
//
//    public int getPriority() {
//        return priority;
//    }

//    public static Enum1 of(int priority) {
//        return Stream.of(Enum1.values())
//                .filter(p -> p.getPriority() == priority)
//                .findFirst()
//                .orElseThrow(IllegalArgumentException::new);
//    }
}
