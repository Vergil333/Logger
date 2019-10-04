This example presents simple logging with log4j in parallel tests.  
As you can [see](https://github.com/Vergil333/Logger/blob/master/logs.log), the logger is not blocked by any test 
and logs the message immediately.

log4j configuration is in [log4j.properties](https://github.com/Vergil333/Logger/blob/master/src/main/resources/log4j.properties) file.

There are 2 options to run tests parallel:
1) By ParallelComputer class of JUnit (experimental) - which I used in this example
2) By Surefire plugin

For more about parallel testing click [here](https://examples.javacodegeeks.com/core-java/junit/junit-run-tests-in-parallel/).
