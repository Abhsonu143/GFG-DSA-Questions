public static boolean isSymmetric(Node root)
    {
        // add your code here;
        if(root==null) return true;
        return isSame(root.left,root.right);
    }
    private static boolean isSame(Node p,Node q){
        if(p==null && q!=null || p!=null && q==null) return false;
        if(p==null && q==null) return true;
        if(p.data != q.data) return false;
        return isSame(p.left,q.right) && isSame(p.right,q.left);
    }