package com.adiye.techprep.datastructures;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nyeluri on 1/22/17.
 */
public class LinkedListTest {

    @Test
    public void testLinkedListAdd() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        Assert.assertEquals(linkedList.get(0),new Integer(1));
        Assert.assertEquals(linkedList.get(1),new Integer(2));
        Assert.assertEquals(linkedList.get(2),new Integer(3));
    }
}
