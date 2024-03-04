public class Main {
    public static void main(String[] args) {

        // Example 1
        BinaryTreeNode node1 = new BinaryTreeNode(5);
        BinaryTreeNode node2 = new BinaryTreeNode(7);
        BinaryTreeNode node3 = new BinaryTreeNode(3);
        BinaryTreeNode node4 = new BinaryTreeNode(4);
        BinaryTreeNode node5 = new BinaryTreeNode(6);

        node1.setLeft(node3);
        node1.setRight(node2);
        node2.setLeft(node5);
        node3.setRight(node4);

        BinaryTree tree1 = new BinaryTree();
        tree1.setRoot(node1);

        System.out.println("BFS:print");
        // Print values in nodes via depth first traversal
        tree1.breadthFirstPrint();

        System.out.println();
        System.out.println("DFS:inorder:print");
        // Print values in nodes via inorder traversal
        tree1.inorderPrint();

        System.out.println();
        System.out.println("DFS:inorder:sum");
        // Print values in nodes via inorder traversal
        System.out.println(tree1.inorderSum());

        System.out.println();
        System.out.println("DFS:inorder:max");
        // Print values in nodes via inorder traversal
        System.out.println(tree1.inorderMax());
    }
}
