Node LCA(Node root, int p, int q)
	{
        // code here.
        if(root==null) return null;
        if(root.data>p && root.data>q) return LCA(root.left,p,q);
        if(root.data<p && root.data<q) return LCA(root.right,p,q);
        return root;
    }