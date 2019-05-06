package node;

import java.util.List;

public class MyTreeNode {

    public int amount;
    public List<MyTreeNode> chilren;

    public MyTreeNode(){

    }
    public MyTreeNode(int amount){
        this.amount = amount;
    }

    public MyTreeNode(int amount, List<MyTreeNode> children){
        this.amount = amount;
        this.chilren = children;
    }

}

