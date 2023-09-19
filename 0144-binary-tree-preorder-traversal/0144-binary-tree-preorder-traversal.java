
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(list,root);
        return list;
    }
    
    void dfs(List<Integer> res, TreeNode node){
        if(node!=null){
            res.add(node.val);
            if(node.left!=null) dfs(res,node.left);
            if(node.right!=null) dfs(res,node.right);
            }
        }
    }