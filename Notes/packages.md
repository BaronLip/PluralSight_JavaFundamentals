**Packages:** (kind of like JS modules.):
1. Follow a naming convention
2. Provide organization.

**Conventions:**
1. All lowercase.
2. Uses a reversed domain name. Ex: "com.pluralsight" vs. "pluralsight.com" for global uniqueness.
3. Adds a further qualifier to assure uniqueness within a company/group. Ex: com.pluralsight.myproject;
	* .myproject maybe any different number of names specific to group.

Members become part of the Package:
Ex:
```JAVA
package com.pluralsight.myproject;

public class Main {
	public static void main(Strings[] args) {
	
	}
}
```

`Main` when part of a Package is no longer just `Main` but, is referred to as `com.pluralsight.myproject.Main`.

**File/Folder structure:**

Package names will affect the Source file structures due to IDEs requiring a sub-folder for each part of the package name. Java itself, as a language does not require this but in practice Package names affect the file/folder structure.

Ex: Main.java alone.
src > 
	Main.java

Ex: Main.java as part of a package. Each part of the name needs to have it's own sub-folder.
src > 
	com > 
		pluralsight > 
			myproject > 
				main.java
