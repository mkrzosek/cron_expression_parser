package org.example.parser;

enum Parser {

    MINUTE(new MinuteParser()),
    HOUR(new HourParser()),
    DAY_OF_MONTH(new DayOfMonthParser()),
    MONTH(new MonthParser()),
    DAY_OF_WEEK(new DayOfWeekParser()),
    COMMAND(new CommandParser());

    private final FieldParser fieldParser;



    Parser(FieldParser minuteParser) {
        this.fieldParser = minuteParser;
    }

    CronField parseField(String field) {
        return this.fieldParser.parseField(field);
    }




}
