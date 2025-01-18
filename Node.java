import java.util.ArrayList;
import java.util.List;
public class Node {
    // Recursive Java program for level order traversal of Binary Tree
    int data;
    Node left, right;

    // Constructor to initialize a new node
    Node(int value) {
        data = value;
        left = right = null;
    }
}

class GfG {
    // Helper function for recursive level order traversal
    static void levelOrderRec(Node root, int level, ArrayList<ArrayList<Integer>> res) {
        if (root == null) return;

        // Add a new level to the result if needed
        if (res.size() <= level) 
            res.add(new ArrayList<>());

        // Add current node's data to its corresponding level
        res.get(level).add(root.data);

        // Recur for left and right children
        levelOrderRec(root.left, level + 1, res);
        levelOrderRec(root.right, level + 1, res);
    }

    // Function to perform level order traversal
    static ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        levelOrderRec(root, 0, res);
        return res;
    }

    public static void main(String[] args) {
        // Create binary tree
        //      1         
        //     / \       
        //    3   2      
        //          \   
        //           4 
        //          /  \
        //         6    5
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(2);
        root.right.right = new Node(4);
        root.right.right.left = new Node(6);
        root.right.right.right = new Node(5);

        // Perform level order traversal
        ArrayList<ArrayList<Integer>> res = levelOrder(root);

        // Print the result
        for (ArrayList<Integer> level : res) {
            for (int data : level) {
                System.out.print(data + " ");
            }
        }
    }
}
