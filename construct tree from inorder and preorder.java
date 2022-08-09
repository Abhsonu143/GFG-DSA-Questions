static int preIndex;
    public static Node buildTree(int in[], int pre[], int n)
    {
        // code here
        preIndex=0;
        return conTree(pre,in,0,n-1);
    }
    private static Node conTree(int[] pre,int[] in,int s,int e){
        if(s>e) return null;
        Node root=new Node(pre[preIndex++]);
        int inIndex=search(in,root.data,s,e);
        root.left=conTree(pre,in,s,inIndex-1);
        root.right=conTree(pre,in,inIndex+1,e);
        return root;
    }
    public static int search(int[] arr,int key,int s,int e){
        for(int i=s;i<=e;i++)
            if(arr[i]==key)
                return i;
        return -1;
    }