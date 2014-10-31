package com.xetius.patterns.prototype.model;

import org.apache.commons.lang3.text.WordUtils;

public enum ShapeType {
    CIRCLE,
    RECTANGLE,
    TRIANGLE;

    String getType() {
        return WordUtils.capitalizeFully(this.toString());
    }
}
