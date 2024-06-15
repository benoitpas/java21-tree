package org.benoit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.AbstractMap;

public class TreeTest {

    @Test
    public void testAddId() {
        Tree.Leaf l = new Tree.Leaf();
        Tree.Branch expectedtb = new Tree.Branch(new WithId(4, "a"),
                new Tree.Branch(new WithId(0, "b"), l, l),
                new Tree.Branch(new WithId(3, "c"),
                        new Tree.Branch(new WithId(1, "d"), l, l),
                        new Tree.Branch(new WithId(2, "e"), l, l)));

        Tree t = new Tree();
        assertEquals(expectedtb, t.addId(App.tb));
    }
}
