package org.example.parser;

class DayOfMonthParser extends FieldParser {

    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 31;

    DayOfMonthParser() {
        super(MIN_RANGE, MAX_RANGE);
    }
}
