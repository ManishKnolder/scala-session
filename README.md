# scala-session
## Session-1 Assignment-1
### Steps To calculate Electricity Bill

**Step 1:** In Intellij move to **session-1-assignment-1/src/main/scala** and create a **CalculateElectricityBill.scala** and after that **use a case class** and pass the parameter to it.          
**Step 2:** Create object and extend the App and inside it create a method that calculate the electricity bill as calculateBill and pass a parameter of case class instance.     
**Step 3:** In that method calculate the total unit and call the getPrice method and pass the total Unit in it.    
**Step 4:** In getPrice method use try catch exception handling and calculate the bill as per the slab with if else if else condition and return the total value and store it in totalAmount variable.        
**Step 5:** After that calculate the GST of total amount and add it with total Amount and return the value.      
**Step 6:** After that add the **scalatest dependencies** in build.sbt file.     
**Step 7:** Create a **Test Class in src/test/scala.** Inside the test class extend the **AnyFlatSpec** Class and import the scalatest package in that test class. **Step 8:** Inside the test class Declare and initialize all the variable such as accountNumber, username, address, previousUnit, currentUnit and  create a instance of case class that defined in CalculateElectricityBill.scala file and pass the parameter to case class.     
**Step 9:** After that call the **calculateBill method and in assert compare the actual value with output** return by calculateBill method with both == or !=.
**Step 10:** In terminal run the command **sbt test it show the result that test case** is passed or fail.      
**OUTPUT**
![Screenshot from 2023-03-14 23-27-58](https://user-images.githubusercontent.com/124979629/225095813-67d85a90-3619-44a8-8480-e416bcbd33c6.png)


## Session-1 Assignment-2
**Step 1:** In Intellij move to **session-1-assignment-2/src/main/scala and create FactorialRecursion.scala file.     
**Step 2:** Inside the file create a singleton object and inside it define a **method factorial** with two parameter **number and accumulator.**    
**Step 3:** Use try catch exception handling if the number is not number(isNAN) then it throw NumberFormatException and catch resolve it.    
**Step 4:** if accumulator less than equal to 1 then return accumulator else call the factorial function and pass the parameter number-1 and accumulator*number.     
**Step 5:** Now add the dependency of scalatest in build.sbt and sync the project.     
**Step 6:** Open the src/test/scala and create test class and extend AnyFlatSpec and import the scalatest package.    
**Step 7:** In Test Class take number and accumulator variable and create instance of Singleton object.    
**Step 8:** Now call the factorial method of Main Class and check the output with expected output in the assert.    
**Step 9:** In terminal run the command **sbt test it show the result that test case** is passed or fail.       
**OUTPUT**
![Screenshot from 2023-03-15 11-16-31](https://user-images.githubusercontent.com/124979629/225222361-80faecfd-176c-48be-8059-0c058eb4eec6.png)
