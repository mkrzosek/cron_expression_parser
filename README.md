# Cron Expression Parser

This Java program parses a CRON expression and prints the parsed fields in a specified format.

## Installation

1. **Clone the repository:**

   First, clone the Git repository to your local machine using the following command:

   ```
   git clone https://github.com/yourusername/cron-expression-parser.gi

2. **Build project:**

    To build this project Java 14+ is required and Maven.
    From the project directory execute following command:

    ```
    mvn clean install

## Usage

To use this program, provide a CRON expression as a single argument when running the Java application.

### Example

```bash
java CronExpressionParser "*/15 0 1,15 * 1-5 /usr/bin/find"
