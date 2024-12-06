package org.example


// TASK 1: Make the list generic
class LinkedList(
    val value: Int,
    var next: LinkedList?
)


class Contact(name: String, email: String)


class ContactList(
    val value: Contact,
    var next: ContactList?
)


// TASK 2: Create a print function that returns a String
fun printLinkedList(list: LinkedList?) {
    print("[")
    if (list == null) {
        print("")
    } else {
        var p = list
        while (p != null) {
            // TASK 3: Fix the bug of having a comma and space after the last element
            print("${p.value}, ")
            p = p.next
        }
    }
    print("]")
}


fun add(value: Int, list: LinkedList?): LinkedList {
    if (list == null) {
        return LinkedList(value, null)
    } else {
        var p = list
        while (p?.next != null)
            p = p.next
        p?.next = LinkedList(value, null)
        return list
    }
}


fun size(list: LinkedList?): Int {
    if (list == null) return 0
    else {
        var p = list
        var result = 0
        while (p != null) {
            result++
            p = p.next
        }
        return result
    }
}


fun main() {
    //val myList = LinkedListNode(10, LinkedListNode(8, LinkedListNode(1, LinkedListNode(2, null))))
    var emptyList: LinkedList? = null
    var list: LinkedList? = LinkedList(1, LinkedList(2, null)) // [1]
    var listWithAdd: LinkedList? = add(3, add(2, add(1, null)))


//   var myList: LinkedList = add(10, list = add(8, list = add(1, list = add(2, list = null))))


    printLinkedList(listWithAdd)


    // TASK 4: Write a small program that allows you to create contacts, put them all in a linked list
    // with an option to exit the program, and when it exists it saves the list to a file in CSV format.
}
