# Week 4 Lab Report

## Code Change #1

### Commit Message
![ChangeOne](change1.png)
### File with Error
[Test with Issue](test-file5.md)

### Symptom
![Error](error1.png)


### Explanation

In the test file, the open parentheses is not directly next to the closing bracket, meaning that what the program identifies as a link is actually not a link. This results in the wrong output when the program is run on this particular file. To fix this, the program will check if the open paren index is immediately followed by the index of the closing bracket.

In addition to this, this version of the code also accounts for potential to skip over other intact links that may follow a broken link. This is achieved by setting the index to the close bracket index + 1 when the parenthesis are not set correctly, so as to restart the loop and look for more links.

## Code Change #2

### Commit Message
![Image](change2.png)

### File with Error

[Test With Issue](test-file8.md)

### Symptom/Error
![Error](error2.png)

### Explanation
 The parser searches for the next closed parenthesis or bracket. When the file contains broken links, the parser will continue to serach infinitely for the next item. To fix this issue, if the parser was unable to find an opening bracket, then it would break and stop the program.
