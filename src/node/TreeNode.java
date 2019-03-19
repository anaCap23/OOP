package node;

import java.util.List;

public class TreeNode {

    public int amount;
    public List<TreeNode> chilren;

    public TreeNode(){

    }
    public TreeNode (int amount){
        this.amount = amount;
    }

    public TreeNode (int amount, List<TreeNode> children){
        this.amount = amount;
        this.chilren = children;
    }

}

