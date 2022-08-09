Node lca(Node root, int p,int q)
	{
		// Your code here
		if(root==null) return null;
		if(root.data==p || root.data==q) return root;
		Node left=lca(root.left,p,q);
		Node right=lca(root.right,p,q);
		if(left!=null && right!=null)
		    return root;
		return left==null?right:left;
	}