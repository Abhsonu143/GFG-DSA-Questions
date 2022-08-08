 public int josephus(int n, int k)
    {
        //Your code here
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
            list.add(i+1);
        int curr=0;
        while(list.size()>1){
            int next=(curr+k-1)%list.size();
            list.remove((curr+k-1)%list.size());
            curr=next;
        }
        return list.get(0);
    }