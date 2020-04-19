Greater than - >

Greater than or equal to - >=

Less than - <

Less than or equal to - <=

Equal to - ==

#### Ternary Conditional Assignment:
**Syntax:**
result = condition ? true-value : false value;

**EX:**
```Java
int v1 = 7;
int v2 = 5;

int vMax = v1 > v2 ? v1 : v2;
System.out.println(vMax); // 7
```

#### If-Else statement:
**Syntax:**
if ( condition-1 ) 
    true-statement-1; 
else if ( condition-2 ) 
    true-statement-2; 
else 
    false-statement;

1. If-Else statements may be nested using curly brackets


**Ex:**
```Java
int v1 = 7; 
int v2 = 5;

if ( v1 > v2 )
	System.out.println("V1 is bigger");
else if ( v2 > v1 )
	System.out.println("v2 is bigger");
else 
	System.out.println("v1 and v2 are equal");
```


#### Block Statements:
Groups multiple statements in a compound statement by using {curly brackets}.

**EX:**
```Java
// You may create multiple variables in one line using commas.
int v1 = 10, v2 = 4, diff;

// The curly brackets allow for multiple statements to be executed. 
if (v1 > v2 ) {
	diff = v1 - v2;
	System.out.println("v1 is bigger.");
	System.out.println(diff);
}
else if ( v2 > v1 ) {
	diff = v2 - v1;
	System.out.println("v2 is bigger.");
	System.out.println(diff);
}
else
	System.out.println("v1 and v2 are equal.");


}
```
**Variables that are declared within a block are not available outside of the block. Their "scope" is limited to within the block.** 


#### Logical Operators:
* And - & - Both sides of logic must be true. 
* Or - | - Only one side of logic needs to be true. May also both sides true.
* Exclusive or (XOR) - ^ - With Exclusive, one side of the logic must be false. Cannot be both sides true.
* Negation - ! - Reverses the result.

#### Conditional Logical Operators:
Operate similarly to logical operators but only evaluates right side when needed.
* Conditional And - && - left side of condition needs to evaluate to true for right side to evaluate.
* Conditional Or - || - left side of condition needs to evaluate to false for right side to evaluate.

#### Switch Statement:
* Transfer control to a statement based on a value.
* Simplifies testing when there are multiple possibilities.
* **Only supports char and int values.**
* **Must use break keyword. Otherwise, all further case statements will be evaluated.**
* Includes a default to handle unmatched values.

**Syntax:**
```Java
switch(test-value) {
	case value-1:
		statements;
	case value-2:
		statements;
	case value-3:
		statements;
	default:
		statements;
}
```

**Example:**
```Java
int iVal = 10;

switch (iVal % 2) { // Tests if iVal is even or odd. Remember: Modulus, no division.
	case 0:
		System.out.print(iVal);
		System.out.println(" is even.");
		break;
	case 1:
		System.out.print(iVal);
		System.out.println(" is odd.");
		break;
	default:
		System.out.println("Oops it broke.");
		break; // Not required here but good convention.
}
```