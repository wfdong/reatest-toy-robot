Code test

Problem description: refer to “PROBLEM.md”

This project contains: pojo, main logics, unit test, integration test. 
Used TDD.

The main classes and logic code are in the folder ./src
The test cases are in the folder ./test

# toy-robot
a code test(Realestate)


Two ways to run this program:
1.run in Eclipse
  Step 1. Import this whole project in to Eclipse(java project);
  Step 2. Find the class “RobotSimlator”, in src/robot/RobotSimlator.java, run it in eclipse;
2.run in command line
  Step 1. Open a command line window, and go to the root of this project directory: reatest-toy-robot/
  Step 2. Compile the source code use this command: 
          javac -d bin src/robot/* src/utils/*
  Step 3. Run the program with this command:
          java -cp bin/ robot.RobotSimlator



When you run the program you will see:
”please input your commands(in upper case, and each command in its own line, sepparate parameters by blank space),enter -1 to end your input:”

Then, just enter the commands one by one, make sure each command is a single line. Just enter -1 to end your input.
For example, you can enter the commands like this:

please input your commands(in upper case, and each command in its own line, sepparate parameters by blank space),enter -1 to end your input:
PLACE 0 0 NORTH
MOVE
RIGHT
MOVE
LEFT
MOVE
REPORT
-1

Then you will get the output:

1, 2, NORTH



You can input many combinations of the commands, if the commands are all valid and executed smoothly, you will get a result(you must input a “REPORT” command to get result)

If there’s any invalid commands, the output will be:
“wrong command!”



