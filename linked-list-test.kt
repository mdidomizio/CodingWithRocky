import org.example.LinkedList
import org.example.size
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull


class LinkedListTest {
    @Test
    fun `size of empty list is zero`() {
        val list: LinkedList? = null


        assertEquals(0, size(list))
    }


    @Test
    fun `size of single element list returns 1`() {
        val list: LinkedList = LinkedList(1, null)


        assertEquals(1, size(list))
    }


    @Test
    fun `size of arbitrary list is correct`() {
        val list: LinkedList = LinkedList(1, LinkedList(2, LinkedList(3, null)))


        assertEquals(3, size(list))
    }


//    @Test
//    fun `print prints an empty list correctly`() {
//        val list: LinkedList? = null
//
//        assertEquals("[]", printLinkedList(list))
//    }
//
//    @Test
//    fun `add element to empty list works`() {
//        val result = add(value = 6, list = null)
//        assertEquals(
//            expected = 6,
//            actual = result.value
//        )
//        assertNull(result.next)
//    }
//
//    @Test
//    fun `add element to non-empty list works`() {
//        val result = add(value = 6, list = add(4, null))
//        assertEquals(
//            expected = 6,
//            actual = result.value
//        )
//        assertNull(result.next)
//    }
}
