boolean isIdentical(Node p, Node q)
	{
	    // Code Here
	    if(p==null && q==null) return true;
        if(p==null && q!=null || p!=null && q==null) return false;
        if(p.data==q.data){
            return isIdentical(p.left,q.left) && isIdentical(p.right,q.right);
        }
        else
            return false;
	}