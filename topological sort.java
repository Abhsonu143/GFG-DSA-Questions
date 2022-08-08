static int[] topoSort(int v, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        int[] res=new int[v];
        int ind=0;
        int[] degree=new int[v];
        for(int i=0;i<v;i++){
            for(int x:adj.get(i)){
                degree[x]++;
            }
        }
        Queue<Integer> q=new ArrayDeque<>();
        for(int i=0;i<v;i++)
            if(degree[i]==0)
                q.add(i);
        while(!q.isEmpty()){
            int curr=q.poll();
            res[ind]=curr;ind++;
            for(int x:adj.get(curr)){
                degree[x]--;
                if(degree[x]==0)
                    q.add(x);
            }
        }
        return res;
    }