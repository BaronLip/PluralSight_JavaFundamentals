```java 
// The Main class name doesn't matter what it is called.
public class Main {
	// However the line below is REQUIRED for all java apps to run, minus the parameters.
    public static void main(String[] args) {
	
    }
}
```

**Java programs may be run from the terminal.**
1. Within the Terminal, navigate to the program directory.
2. Now, navigate deeper into out > production > programNameFolder.
3. You should see the file Main.class. Or the main class you have customized.
4. $ java Main or $ java WhateverTheMainClassHasBeenRenamed.

** Run a program when the program is created within a package:**
1. Within the Terminal, navigate to the program directory.
2. Now, navigate deeper into the nested structure of the package name.
	* program folder > out > production > programNameFolder > com > domainName > applicationName
	* The Main.java file should be in the last applicationName folder.
3. $ java com.pluralsight.applicationName.Main

Programs are made from statements.
All statement must end with a semi-colon, ";".

**Comments:**
"//" are prefaced with two forward slashes. Just like JavaScript.
"/**/" multi-line comments.
"//**...*/" - JavaDoc comments allow for documentaion comments to be written in the source code. It requires the JavaDoc utility.

