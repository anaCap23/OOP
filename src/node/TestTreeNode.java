package node;

import java.util.Arrays;

public class TestTreeNode {
    public static void main(String[] args) {

        MyTreeNode employee1 = new MyTreeNode(1000);
        MyTreeNode employee2 = new MyTreeNode(1000);
        MyTreeNode employee3 = new MyTreeNode(1000);
        MyTreeNode employee4 = new MyTreeNode(1000);
        MyTreeNode employee5 = new MyTreeNode(1000);

        MyTreeNode manager1 = new MyTreeNode(200, Arrays.asList(employee1, employee2));
        MyTreeNode manager2 = new MyTreeNode(200, Arrays.asList(employee3, employee4, employee5));
        MyTreeNode manager3 = new MyTreeNode(200);

        MyTreeNode directr = new MyTreeNode(1000, Arrays.asList(manager1, manager2, manager3));

        int amount = TreeNodeUtils.count(directr);
        System.out.println(amount);
    }
}
