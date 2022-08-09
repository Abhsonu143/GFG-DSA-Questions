public static int isSumProperty(Node root)
    {
        // add your code here
        return check(root)?1:0;
    }
    private static boolean check(Node root){
        if(root==null || (root.left==null && root.right==null)) return true;
        if(root.left==null){
            if(root.data==root.right.data)
                return check(root.right);
            else return false;
        }
        if(root.right==null){
            if(root.data==root.left.data)
                return check(root.left);
            else return false;
        }
        if(root.data==(root.left.data+root.right.data))
            return check(root.left) && check(root.right);
        else
            return false;
    } 