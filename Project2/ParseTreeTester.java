import org.junit.Test;

import static org.junit.Assert.*;

public class ParseTreeTester {

    ParseTree parseTree;

    private void setUp1() {
        ParseTreeNode node1 = new ParseTreeNode("a");
        ParseTreeNode node2 = new ParseTreeNode("b");
        ParseTreeNode node3 = new ParseTreeNode("S");
        node3.addChild(node1);
        node3.addChild(node2);
        ParseTreeNode node4 = new ParseTreeNode("a");
        ParseTreeNode node5 = new ParseTreeNode("b");
        ParseTreeNode node6 = new ParseTreeNode("S");
        node6.addChild(node4);
        node6.addChild(node3);
        node6.addChild(node5);
        parseTree = new ParseTree(node6);
    }

    private void setUp2() {
        ParseTreeNode node1 = new ParseTreeNode("a");
        ParseTreeNode node2 = new ParseTreeNode("b");
        ParseTreeNode node3 = new ParseTreeNode("S");
        node3.addChild(node1);
        node3.addChild(node2);
        parseTree = new ParseTree(node3);
    }

    private void setUp3() {
        ParseTreeNode node1 = new ParseTreeNode("E");
        parseTree = new ParseTree(node1);
        ParseTreeNode node2 = new ParseTreeNode("E");
        ParseTreeNode node3 = new ParseTreeNode("+");
        ParseTreeNode node4 = new ParseTreeNode("E");
        node1.addChild(node2);
        node1.addChild(node3);
        node1.addChild(node4);
        ParseTreeNode node5 = new ParseTreeNode("1");
        node2.addChild(node5);
        ParseTreeNode node6 = new ParseTreeNode("0");
        node4.addChild(node6);
    }

    private void setUp4() {
        ParseTreeNode node1 = new ParseTreeNode("E");
        parseTree = new ParseTree(node1);
        ParseTreeNode node2 = new ParseTreeNode("E");
        ParseTreeNode node3 = new ParseTreeNode("*");
        ParseTreeNode node4 = new ParseTreeNode("E");
        node1.addChild(node2);
        node1.addChild(node3);
        node1.addChild(node4);
        ParseTreeNode node5 = new ParseTreeNode("1");
        node2.addChild(node5);
        ParseTreeNode node6 = new ParseTreeNode("(");
        ParseTreeNode node7 = new ParseTreeNode("E");
        ParseTreeNode node8 = new ParseTreeNode(")");
        node4.addChild(node6);
        node4.addChild(node7);
        node4.addChild(node8);
        ParseTreeNode node9 = new ParseTreeNode("E");
        ParseTreeNode node10 = new ParseTreeNode("+");
        ParseTreeNode node11 = new ParseTreeNode("E");
        node7.addChild(node9);
        node7.addChild(node10);
        node7.addChild(node11);
        ParseTreeNode node12 = new ParseTreeNode("1");
        node9.addChild(node12);
        ParseTreeNode node13 = new ParseTreeNode("1");
        node11.addChild(node13);
    }

    private void setUp5() {
        ParseTreeNode node1 = new ParseTreeNode("S");
        parseTree = new ParseTree(node1);
        ParseTreeNode node2 = new ParseTreeNode("1");
        ParseTreeNode node3 = new ParseTreeNode("C");
        node1.addChild(node2);
        node1.addChild(node3);
        ParseTreeNode node4 = new ParseTreeNode("1");
        ParseTreeNode node5 = new ParseTreeNode("C");
        node3.addChild(node4);
        node3.addChild(node5);
        ParseTreeNode node6 = new ParseTreeNode("1");
        ParseTreeNode node7 = new ParseTreeNode("C");
        node5.addChild(node6);
        node5.addChild(node7);
        ParseTreeNode node8 = new ParseTreeNode("1");
        node7.addChild(node8);
    }

    @Test
    public void testTree1A() {
        setUp1();
        assertEquals("Parse Tree 1: Count Terminal Nodes", 4, parseTree.countTerminalNodes());
    }

    @Test
    public void testTree1B() {
        setUp1();
        assertEquals("Parse Tree 1: Count NonTerminal Nodes", 2, parseTree.countNonTerminalNodes());
    }

    @Test
    public void testTree1C() {
        setUp1();
        assertEquals("Parse Tree 1: Extract Word", "aabb", parseTree.extractWord());
    }

    @Test
    public void testTree1D() {
        setUp1();
        assertEquals("Parse Tree 1: Extract Derivation", "[S -> a[S -> ab]b]", parseTree.extractDerivation());
    }

    @Test
    public void testTree2A() {
        setUp2();
        assertEquals("Parse Tree 2: Count Terminal Nodes", 2, parseTree.countTerminalNodes());
    }

    @Test
    public void testTree2B() {
        setUp2();
        assertEquals("Parse Tree 2: Count NonTerminal Nodes", 1, parseTree.countNonTerminalNodes());
    }

    @Test
    public void testTree2C() {
        setUp2();
        assertEquals("Parse Tree 2: Extract Word", "ab", parseTree.extractWord());
    }

    @Test
    public void testTree2D() {
        setUp2();
        assertEquals("Parse Tree 2: Extract Derivation", "[S -> ab]", parseTree.extractDerivation());
    }

    @Test
    public void testTree3A() {
        setUp3();
        assertEquals("Parse Tree 3: Count Terminal Nodes", 3, parseTree.countTerminalNodes());
    }

    @Test
    public void testTree3B() {
        setUp3();
        assertEquals("Parse Tree 3: Count NonTerminal Nodes", 3, parseTree.countNonTerminalNodes());
    }

    @Test
    public void testTree3C() {
        setUp3();
        assertEquals("Parse Tree 3: Extract Word", "1+0", parseTree.extractWord());
    }

    @Test
    public void testTree3D() {
        setUp3();
        assertEquals("Parse Tree 3: Extract Derivation", "[E -> [E -> 1]+[E -> 0]]", parseTree.extractDerivation());
    }

    @Test
    public void testTree4A() {
        setUp4();
        assertEquals("Parse Tree 4: Count Terminal Nodes", 7, parseTree.countTerminalNodes());
    }

    @Test
    public void testTree4B() {
        setUp4();
        assertEquals("Parse Tree 4: Count NonTerminal Nodes", 6, parseTree.countNonTerminalNodes());
    }

    @Test
    public void testTree4C() {
        setUp4();
        assertEquals("Parse Tree 4: Extract Word", "1*(1+1)", parseTree.extractWord());
    }

    @Test
    public void testTree4D() {
        setUp4();
        assertEquals("Parse Tree 4: Extract Derivation", "[E -> [E -> 1]*[E -> ([E -> [E -> 1]+[E -> 1]])]]", parseTree.extractDerivation());
    }

    @Test
    public void testTree5A() {
        setUp5();
        assertEquals("Parse Tree 5: Count Terminal Nodes", 4, parseTree.countTerminalNodes());
    }

    @Test
    public void testTree5B() {
        setUp5();
        assertEquals("Parse Tree 5: Count NonTerminal Nodes", 4, parseTree.countNonTerminalNodes());
    }

    @Test
    public void testTree5C() {
        setUp5();
        assertEquals("Parse Tree 5: Extract Word", "1111", parseTree.extractWord());
    }

    @Test
    public void testTree5D() {
        setUp5();
        assertEquals("Parse Tree 5: Extract Derivation", "[S -> 1[C -> 1[C -> 1[C -> 1]]]]", parseTree.extractDerivation());
    }
}

