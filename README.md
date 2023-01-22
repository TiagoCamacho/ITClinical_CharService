# ITClinical_CharService
Project instructions

Write a java service using a TDD approach that, given a text, returns every Nth character from that text that is uppercase. N is a configurable parameter.

For example:
- Given "ITCLiNicAl" and N = 1, the return value will be "ITCLNA";
- Given "ITCLiNicAl" and N = 2, the return value will be "TLN";
- Given "ITCLiNicAl" and N = 3, the return value will be "CNA";
- Given "ITCLiNicAl" and N = 100, the return value will be "";
- Given "ITCLiNicAl" and N = -1, the return value will be ""; 

How to submit:
Upload your completed project to a repository of your choice, and then send us a link to the repository. We ask that that you push your developments to the repository often and in small increments, so that we can follow your train of thought as you advanced in the exercise.


Optional tasks (for extra credit):

After completing the previous exercise, you may also implement one or both of these requirements for extra credit:

- Optional Task 1: Your service now returns every Nth character from the input text that is either an uppercase letter, a number, or a special character. For example:
 Given "!tCL1Nical" and N = 1, the return value will be "!CL1N"
 
- Optional Task 2: Your service now also prints a count of each type of character returned. For example:
 Given "ItCLINiCAL" and N = 1, the return value will be "ICLINCAL", and the following output will be printed in the console:
 
 I = 2
 C = 2
 L = 2
 N = 1
 A = 1

# How to use console
 Run the console from the InputConsole.java;
 
 Then you have 2 choices and askes for your input:
 ```
1- Find Uppercase in text.
2- Find Uppercase or Digit or Special character in text.
Please enter function number:
```
Pick one and insert the text that you want to use and the N to get the characters;
The final result should be something like the following:
 ```
 Please enter input text:
ITCLiNicAl
Please enter N number:
1
Result: ITCLNA
I = 1
T = 1
C = 1
L = 1
N = 1
A = 1
```

