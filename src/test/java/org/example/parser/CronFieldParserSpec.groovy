package org.example.parser

import spock.lang.Specification

class CronFieldParserSpec extends Specification {

    static CronParser cronExpressionParser

    def setupSpec() {
        cronExpressionParser = new CronParser()
    }

    def "should parse minutes"(String cronExpression, String minutes) {
        expect:
        CronExpression result = cronExpressionParser.parse(cronExpression)
        result.minutes.toString() == minutes

        where:
        cronExpression                      | minutes
        "*/15 0 1,15 * 1-5 /usr/bin/find"   | "0 15 30 45"
    }

    def "should parse hours"(String cronExpression, String hours) {
        expect:
        CronExpression result = cronExpressionParser.parse(cronExpression)
        result.hours.toString() == hours

        where:
        cronExpression                      | hours
        "*/15 0 1,15 * 1-5 /usr/bin/find"   | "0"
    }

    def "should parse day of month"(String cronExpression, String dayOfMonth) {
        expect:
        CronExpression result = cronExpressionParser.parse(cronExpression)
        result.dayOfMonth.toString() == dayOfMonth

        where:
        cronExpression                      | dayOfMonth
        "*/15 0 1,15 * 1-5 /usr/bin/find"   | "1 15"
    }

    def "should parse months"(String cronExpression, String months) {
        expect:
        CronExpression result = cronExpressionParser.parse(cronExpression)
        result.months.toString() == months

        where:
        cronExpression                      | months
        "*/15 0 1,15 * 1-5 /usr/bin/find"   | "1 2 3 4 5 6 7 8 9 10 11 12"
    }

    def "should parse day of week"(String cronExpression, String dayOfWeek) {
        expect:
        CronExpression result = cronExpressionParser.parse(cronExpression)
        result.dayOfWeek.toString() == dayOfWeek

        where:
        cronExpression                      | dayOfWeek
        "*/15 0 1,15 * 1-5 /usr/bin/find"   | "1 2 3 4 5"
    }

    def "should parse command"(String cronExpression, String command) {
        expect:
        CronExpression result = cronExpressionParser.parse(cronExpression)
        result.command.toString() == command

        where:
        cronExpression                      | command
        "*/15 0 1,15 * 1-5 /usr/bin/find"   | "/usr/bin/find"
    }
}
