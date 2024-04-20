package org.example.parser

import spock.lang.Specification

class CronFieldParserSpec extends Specification {

    static CronParser cronExpressionParser

    def setupSpec() {
        cronExpressionParser = new CronParser()
    }


    def "should parse expression"(String cronExpression, String minutes, String hours) {
        expect:
        cronExpressionParser.parse(cronExpression).minutes.toString() == minutes.toString()
        cronExpressionParser.parse(cronExpression).hours.toString() == hours.toString()

        where:
        cronExpression                  | minutes | hours
        "2 3"                           | "2"     | "3"
        "2,3 4"                         | "2 3"   | "4"
    }
}
