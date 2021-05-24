/**
Immutability of Vectors:
Complete the implementation of this Scala program.
When a user starts a new account, PlayerInventory is initialized with 3 basic items, "lumber", "stone", "magic potion". 
It should also be possible to add and drop items from the inventory, with duplicate items added and removed separately. 
For example, if “lumber” was added to the inventory and “stone” was removed, getItems() should return a Vector containing “lumber”, “magic potion”, and “lumber”, 
in any order.
*/

import scala.collection.mutable.ListBuffer

class PlayerInventory {

    private var items: Vector[String] = Vector("lumber", "stone", "magic potion")

    var itemAdded=new ListBuffer[String]
    var itemDropped=new ListBuffer[String]
    
    def getItems(): Vector[String] = {
        
        var v1 = items++itemAdded.toList

        var newList =v1.toList
        
        itemDropped.foreach((arg)=>{
            
            var i:Int = newList.indexOf(arg)
            newList = newList.patch(i,Nil,1)
            
        })

        var v2=newList.toVector
        v2
    }

    def addToInventory(item: String):Unit = {
        itemAdded+=item
    }

    def dropFromInventory(item:String): Unit = {
        itemDropped.append(item)
    }

}

object PlayerInventory {

    def main(args:Array[String]) = {
        var p:PlayerInventory = new PlayerInventory

        p.addToInventory("lumber")
        p.addToInventory("door")
        p.addToInventory("wood")
        p.addToInventory("window")
        p.addToInventory("brakes")
        p.addToInventory("window")
        p.dropFromInventory("magic potion")
        p.dropFromInventory("brakes")

        println(p.getItems()) // lumber, stone, lumber, door, wood, window, window
    }
}
