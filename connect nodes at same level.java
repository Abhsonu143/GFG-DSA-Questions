public void connect(Node root)
    {
        // Your code goes here.
        if(root==null) return;
        Queue<Node> q=new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Node curr=q.poll();
                if(i!=size-1)
                    curr.nextRight=q.peek();
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
        }
        
    }