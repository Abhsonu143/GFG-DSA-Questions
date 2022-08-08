static int pos;
    static int[] findOrder(int n, int m, ArrayList<ArrayList<Integer>> pre) 
    {
        // add your code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());
        for(ArrayList<Integer> list:pre)
            adj.get(list.get(0)).add(list.get(1));
        
        if(isCycle(n,adj))
            return new int[]{};
        pos=0;
        int[] res=new int[n];
        toposort(n,pre,res);
        // for(int i=0;i<n;i++)
        //     System.out.println(adj.get(i).size());
        return res;
        
    }
    private static void toposort(int v,ArrayList<ArrayList<Integer>> pre,int[] res){
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<v;i++)
            adj.add(new ArrayList<>());
        for(ArrayList<Integer> list:pre)
            adj.get(list.get(1)).add(list.get(0));
            
        int[] indegree=new int[v];
        for(int i=0;i<v;i++)
                for(int x:adj.get(i))
                    indegree[x]++;
        Queue<Integer> q=new ArrayDeque<>();
        for(int i=0;i<v;i++)
            if(indegree[i]==0)
                q.add(i);
        while(!q.isEmpty()){
            int curr=q.poll();
            res[pos++]=curr;
            for(int x:adj.get(curr)){
                indegree[x]--;
                if(indegree[x]==0) 
                    q.add(x);
            }
        }
        
    }
    private static boolean isCycle(int v,ArrayList<ArrayList<Integer>> adj){
        boolean[] vis=new boolean[v];
        boolean[] dfsvis=new boolean[v];
        for(int i=0;i<v;i++)
            if(!vis[i])
                if(dfs(adj,i,vis,dfsvis))
                    return true;
        return false;
    }
    private static boolean dfs(ArrayList<ArrayList<Integer>> adj,int curr,boolean[] vis,boolean[] dfsvis){
        vis[curr]=true;
        dfsvis[curr]=true;
        for(int x:adj.get(curr)){
            if(!vis[x]){
                if(dfs(adj,x,vis,dfsvis))
                    return true;
            }
            else if(dfsvis[x])
                return true;
        }
        dfsvis[curr]=false;
        return false;
    }