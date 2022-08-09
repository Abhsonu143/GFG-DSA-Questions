static int res;
    int diameter(Node root) {
        // Your code here
        res=0;
        height(root);
        return res;
    }
    static int height(Node root){
        if(root==null) return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        res=Math.max(res,1+lh+rh);
        return 1+Math.max(lh,rh);
    }