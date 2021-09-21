# Hyperskill-Java
This is the Coffee Machine project for the Java Developer track on hyperskill.
Stage 1 and 2 have been left out because those were some fundamental skills that I already had. 
The solutions will start from stage 3 of the project

Stage 3: 
Get input from the barista on how much water, milk and coffee beans are in the machine
A predetermined amount of each ingredient is needed to make one cup of coffee (200ml of water, 50ml milk and 15g coffee beans)
Ask the user how many cups of coffee they would like
If there are enough ingredients for the amount the customer wants output that the order can be fulfilled, if there are enough ingredients for more cups, indicate this
If there are not enough ingredients for the order, tell the customer and indicate how many cups of coffee an be made.
======SOLUTION======
Gather all the inputs from the barista in the order indicated by the question
Get the user to input how many cups of coffee they would like
Create an array with the amounts needed for a cup of coffee
Determine the ingredients needed per cup of coffee
If there is too little water, milk or coffee beans for one cup, indicate that no cups can be made
If there is enough coffee for at least one cup:
The min amount of the array will show how many cups of coffee can be made
The ectra cups that can be made will be the minimum available cups minus the order number. 
