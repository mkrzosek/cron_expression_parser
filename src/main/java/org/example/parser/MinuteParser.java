package org.example.parser;

class MinuteParser extends FieldParser {

    private static final int MIN_RANGE = 0;
    private static final int MAX_RANGE = 59;

    MinuteParser() {
        super(MIN_RANGE, MAX_RANGE);
    }
}
