package day_02;

/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。
 * *（ps：我们约定空树不是任意一个树的子结构）
 */
public class HasSubtree {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root2 == null) return false;
        if (root1 == null && root2 != null) return false;
        boolean flag = false;
        if (root1.val == root2.val) {//以这个根节点为为起点判断是否包含Tree2
            flag = isSubTree(root1, root2);
        }
        if (!flag) { //如果找不到，那么就再去root的左儿子当作起点，去判断时候包含Tree2
            flag = HasSubtree(root1.left, root2);
            if (!flag) { //如果还找不到，那么就再去root的右儿子当作起点，去判断时候包含Tree2
                flag = HasSubtree(root1.right, root2);
            }
        }
        return flag;
    }


    private boolean isSubTree(TreeNode root1, TreeNode root2) {
        if (root2 == null) return true; //如果Tree2已经遍历完了都能对应的上，返回true
        if (root1 == null && root2 != null) {//如果Tree2还没有遍历完，Tree1却遍历完了。返回false
            return false;
        }
        if (root1.val == root2.val) {//如果根节点对应的上，那么就分别去子节点里面匹配
            return isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);
        } else {//如果其中有一个点没有对应上，返回false
            return false;
        }
    }
}
