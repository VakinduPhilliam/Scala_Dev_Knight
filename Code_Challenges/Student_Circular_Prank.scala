/*
Student Circular Prank:
A teacher is trying to give out treats to a group of students. 
He decides the fairest way to divide the treats is to seat the students around a circular 
table in sequentially numbered chairs. 
A chair number will be drawn from a hat. Beginning with the student in that chair, 
one candy will be handed to each students sequentially around the table until all have been 
distributed.
The teacher is playing a little joke, though. The last piece of candy looks like all the 
others, but it tastes awful. 
Determine the chair number occupied by the student who will receive that candy.
For example, there are 4 students and 6 pieces of candy. 
The students arrange themselves in seats numbered 1 to 4. 
Let's suppose 2 is drawn from the hat, students receive candy at positions 2,3,4,1,2,3. 
The student to be pranked sits in the last chair, which in this case is number 3.
Write a Scala program to identify the student who gets the awful tasting sweet.
The program should have a function prankTheStudent(n:Int, m:Int, s:Int). 
This function should return an integer representing the chair number of the student to get 
pranked.
The prankTheStudent(n:Int, m:Int, s:Int) function has the following parameter(s):
n: an integer representing the number of students, 
m: an integer representing the number of treats, 
s: an integer representing the chair number to begin passing out sweets from.
*/

object PrankTheStudent {

    def main(args:Array[String]):Unit = {

        println(prankTheStudent(4,6,2))

    }

    def prankTheStudent(n:Int, m:Int, s:Int):Int = {

    var value= (n+m+s-1)%n
        
    if (value==0) n else value

    }

}

