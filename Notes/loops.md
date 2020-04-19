#### Looping:

1. While Loop
	* Will continually loops "while" the condition is met at the beginning.
	* May never execute, based on condition.
	
	**Syntax:**
	```Java
	while (condition) {
		statement;
	}
	```
	**Factorial Example:**
	```Java
	// Initial code:
	int kVal = 5;
	int factorial = 1;
	
	while (kval > 1 ){
		factorial *= kval;
		kval -= 1;
	}
	System.out.println(factorial);
	
	// Refactored:
	while (kval > 1) {
		factorial *= kVal--; // was able to decrement with postfix and reduce to one line.
	}
	System.out.println(factorial);
	```
	
2. Do-While Loop
	* Checks condition at the end of the loop.
	* Will always execute block the initial round.
	
	**Ex:**
	```Java
	int iVal = 5;
	
	do {
		System.out.println(iVal);
		System.out.print(" * 2 = ");
		iVal *= 2;
		System.out.println(iVal);
	} while ( iVal < 100 );
	
	// 5 * 2 = 10
	// 10 * 2 = 20
	// 20 * 2 = 40
	// 40 * 2 = 80
	// 80 * 2 = 160
	```

3. For Loop:
	* Repeated executes statement as long as condition is true.
	* A more convenient While loop.
	
	**Syntax:**
	```Java
	for (initialize; condition; update) {
		statement;
	}
	```
	
	**Ex:**
	```Java
	for( int iVal = 1; iVal < 100; iVal *= 2) {
		System.out.println(iVal);
	}
	```

4. For Each Loop:
	* Executes a statement once for each element in an **Array**.
	* Handles getting collection length.
	* Handles accessing each value.

	**Syntax:**
	```Java
	for ( loop-variable-declaration: array ) {
		statement;
	}
	```
	**Example:**
	```Java
	float[] theVals = { 10.0f, 20.0f, 30.0f };
	
	float sum = 0.0f;
	
	for (float currentVal: theVals) {
		sum += currentVal;	
	}
	System.out.println(sum);
	```