package org.example.parser;

class HourParser extends FieldParser {

    private static final int MIN_RANGE = 0;
    private static final int MAX_RANGE = 23;

    HourParser() {
        super(MIN_RANGE, MAX_RANGE);
    }
}
