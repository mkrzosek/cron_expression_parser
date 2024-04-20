package org.example.parser;

class MonthParser extends FieldParser {

    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 12;

    MonthParser() {
        super(MIN_RANGE, MAX_RANGE);
    }
}
