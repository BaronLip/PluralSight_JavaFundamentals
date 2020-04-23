#### A variable is named data storage.

Java is "strongly typed". Meaning the data-type is explicitly named.
`int number = 1`

`int` stands for "integer".

#### Variable naming conventions:
1. **camelCase**
2. letters, numbers, $ and _ are valid.
3. however, only letters and numbers are used by convention.
4. first character/word is always a lowercase character.
5. following words' first characters are capitalized.

#### Primitive datatypes:
these data types are built into the language
* Integer 
	1. byte - 8 bits
	2. short - 16 bits
	3. int - 32 bits
	4. long - 64 bits requires a "l" at the end of the value.

* Floating point - contains a fractional portion.
	1. float - 32 bit 
		* Ex: float milesInAMarathon = 26.2f;
	2. double - 64 bit 
		* Ex: double atomWidthInMeters - 0.0000000001d;

* Character - char stands for a single character, not a String.
	* char regularU = 'U';
	* **char values must be assigned with single quotes!**
	* Can be assigned Unicode characters. char accentedU = "\uooDA"; // Ú

* Boolean - True or False values.
	* boolean iLoveJava = true;

* String - Multiple character value.


#### Stored By Value:
Each variable has it's own copy of the value. When assigning on variable the value of another variable, a copy of the value is made. If the first variables value changes, the second remains at it's initial assignment.

```Java
int myNumber = 1;
int secondNumber = myNumber;
// secondNumber = 1

myNUmber = 2;
// myNumber = 2
// secondNumber = 1
// secondNumber's value does not change even though it was assigned the value of myNumber when created.
```

#### Arithmetic Oporators:
1. Basic Operators:
	* +, -, *, /, %
	* With division, float operations will leave a remainder. However integer operations will lose the remainder and only the whole number is returned. 

2. Prefix/ Postfix Operators:
	1. ++ increment operator. 
	2. -- decrement operator.
	
	* Prefix operator applies operation before returning value.
	``` Java
		int myVal = 1;
		System.out.println(++myVal); // 6, 5 is incremented by one. Then returned.
		System.out.println(myVal); // 6, remains incremented by one.
	```	
	* Postfix operator applies operation after returning value.
	```Java
		int myVal = 1;
		System.out.println(myVal--); // 1, decrement is after return.
		System.out.println(myVal); // 0, decrement occurred and myVal's value has changed.
	```
	
3. Compound Assignment Operators:
	* Combines an operation and assignment.
	```Java
	int myVal = 5;
	myVal -= 5; // subtract 5 and assign the value to the variable.
	System.out.println(myVal); // 0. 
	```
	* Compound assignments are available to all 5 Basic operators. 


#### Order of operations:

Multiplication and Division have the same precedence.
When on the same line, the operation will have from left to right, whichever is first. 


#### Type Conversion:
1. Implicit Conversion (Widening conversion):
	Conversions happen automatically by the compiler to the largest/widest value.
	```JAVA
	int iVal = 50;
	long lval = iVal; // The compiler will convert the value of iVal to be a long data type.
	```

2. Explicit Conversion (Widening or Narrowing conversion):
	Explicitly converting the data-type can be larger or smaller(narrowing) data type.
	```Java
	long lVal = 50;
	int iVal = (int) lVal; // (int) explicitly converts the lVal to a 32 bit variable.
	```