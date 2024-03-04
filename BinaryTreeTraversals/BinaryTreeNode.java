public class BinaryTreeNode {
    private int value;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    // Constructor
    public BinaryTreeNode(int valueInput) {
        setValue(valueInput);
        setLeft(null);
        setRight(null);
    }

    // Getter and setter methods for the member variables
    public void setValue(int valueInput) { value = valueInput; }
    public int getValue() { return value; }
    public BinaryTreeNode getLeft() { return left; }
    public void setLeft(BinaryTreeNode leftInput) { left = leftInput; }
    public BinaryTreeNode getRight() { return right; }
    public void setRight(BinaryTreeNode rightInput) { right = rightInput; }
}
