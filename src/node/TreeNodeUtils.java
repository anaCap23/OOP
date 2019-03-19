package node;

import java.util.List;

public class TreeNodeUtils {

    public static int count (TreeNode root){

        int amount = root.amount;

        List<TreeNode> children= root.chilren;

        if(children == null){
            return amount;
        }

        for (TreeNode child : children) {
                int returnedRes = count(child);
            amount += returnedRes;
            
        }
        return amount;
    }
}
