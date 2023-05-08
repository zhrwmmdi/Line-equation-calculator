# Line-equation-calculator
This is a program in which you enter two points components as X and Y, then calculates it's line equation.
You call the getPoints() method and the program runs in this way:

    Enter the x and y components of the first point: 
	   2 3
	  Enter the x and y components of the second point: 
	  5 4
	  Line equation: y = 0.3x+2.3
	  
If the user enters repeated points the program throws an exception and continues getting points until the points are valid:

	  Enter the x and y components of the first point: 
	  1 2
	  Enter the x and y components of the second point: 
	  1 2
	  Please enter two different points!

	  Enter the x and y components of the first point: 
	  
The program also has a checkPoint() method, it gets two points and calculates the line equation, then asks the user to enter the components of a third point, then it checks if this third point is on the calculated line or not.

	  Enter the x and y components of the first point: 
	  2 3
	  Enter the x and y components of the second point: 
	  5 4
	  Line equation: y = 0.3x+2.3
	  Enter the x and y components of the target point: 
	  1 3
	  The target point IS NOT on this target line.
