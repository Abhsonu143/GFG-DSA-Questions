boolean isBalanced(Node root)
    {
	    // Your code here
	    if(root==null) return true;
	    if(Math.abs(height(root.left)-height(root.right))<=1){
	        return isBalanced(root.left) && isBalanced(root.right);
	    }
	    else
	        return false;
	
    }
    static int height(Node root){
        if(root==null) return 0;
        return Math.max(1+height(root.left),1+height(root.right));
    }