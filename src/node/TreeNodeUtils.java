package node;

import java.util.List;

public class TreeNodeUtils {

    public static int count (MyTreeNode root){

        int amount = root.amount;

        List<MyTreeNode> children= root.chilren;

        if(children == null){
            return amount;
        }

        for (MyTreeNode child : children) {
                int returnedRes = count(child);
            amount += returnedRes;
            
        }
        return amount;
    }
}
