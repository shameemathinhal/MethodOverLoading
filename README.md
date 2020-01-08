# MethodOverLoading
To implement overloading concept by overloading methods and constructors.

	To implement overloading concept by overloading methods and constructors.
Logical Description:
Constructor
		Constructor is a special member function. This is used to give initial values to member variables. The general form is:
		Constructorname ( parameters)
		{
			Statements to give initial values
		}
It should be declared as public
No return type needed.
Constructor name should be same as the name of the class.
When the object is declared for the class, it automatically executes the constructor.

Method Overloading:
The concept of defining two or more methods within the same class that share the same   name, as long as their parameter declarations are different is called as Method Overloading.
Each overloaded method must take a unique list of argument types.
When an overloaded method is called, java uses the type and/or number of arguments to decide which version of the overloaded method to actually call.
Class classname
    {
		variable declarations;
		void add ( );	// add with no arguments
		int add(int,int);  // add with two integer arguments
		void add(float,int); // add with two arguments float and int
  }
Algorithm:
Start the process.
Create a class that contains various types of constructors and methods.
Each method and constructor is differentiated by its parameters.
Now create another class with main() function.
In this class, we create objects for the previous class.
With the help of various types of input from the user, we call the appropriate constructor and methods.
We then call the various methods with different parameters and overload them.
We display all the overloaded constructors and methods.
Halt the program execution.
