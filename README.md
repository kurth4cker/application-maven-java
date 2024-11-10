# application-maven-java - SampleApplication

Template for pure Java application with Apache Maven.


## Building

This project uses Apache Maven as build tool.

    # compile classes
    mvn compile

    # build packages
    mvn package

    # run tests
    mvn test

    # clean
    mvn clean

After building package, jar file is located at `target` directory. Run it with

    java -jar target/SampleApplication-XXXX.jar

where XXXX is version number.


## Copying

**application-maven-java** is licensed under Apache-2.0 license. See file
COPYING for details.
