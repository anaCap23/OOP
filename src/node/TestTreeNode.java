package node;

import jdk.nashorn.api.tree.Tree;

import java.util.Arrays;

public class TestTreeNode {
    public static void main(String[] args) {

        TreeNode employee1 = new TreeNode(1000);
        TreeNode employee2 = new TreeNode(1000);
        TreeNode employee3 = new TreeNode(1000);
        TreeNode employee4 = new TreeNode(1000);
        TreeNode employee5 = new TreeNode(1000);

        TreeNode manager1 = new TreeNode(200, Arrays.asList(employee1, employee2));
        TreeNode manager2 = new TreeNode(200, Arrays.asList(employee3, employee4, employee5));
        TreeNode manager3 = new TreeNode(200);

        TreeNode directr = new TreeNode(1000, Arrays.asList(manager1, manager2, manager3));

        int amount = TreeNodeUtils.count(directr);
        System.out.println(amount);
    }
}
