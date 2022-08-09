static class pair{
        Node node;
        int pos;
        pair(Node node,int pos){
            this.node=node;
            this.pos=pos;
        }
    }
    static int min,max;
    public static int verticalWidth(Node root)
	{
	    // code here.
	    if(root==null) return 0;
	    min=Integer.MAX_VALUE;
	    max=Integer.MIN_VALUE;
	    Set<Integer> set=new HashSet<>();
	    
	    Queue<pair> q=new ArrayDeque<pair>();
	    q.add(new pair(root,0));
	    while(!q.isEmpty()){
	        Node curr=q.peek().node;
	        int pos=q.poll().pos;
	        min=Math.min(min,pos);max=Math.max(max,pos);
	        set.add(pos);
	        if(curr.left!=null) q.add(new pair(curr.left,pos-1));
	        if(curr.right!=null) q.add(new pair(curr.right,pos+1));
	    }
	    int res=0;
	    for(int i=min;i<=max;i++)
	        if(set.contains(min))
	            res++;
	    return res;
	    
	}