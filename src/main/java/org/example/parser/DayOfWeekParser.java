package org.example.parser;

class DayOfWeekParser extends FieldParser {

    private static final int MIN_RANGE = 0;
    private static final int MAX_RANGE = 6;

    DayOfWeekParser() {
        super(MIN_RANGE, MAX_RANGE);
    }
}
