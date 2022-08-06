public static Node partition(Node l, Node h)
    {
        //code here.
       Node last=h;
       Node pivot=l;
       for(Node x=l;x!=h;x=x.next){
           if(x.data<last.data){
               swap(x,pivot);
               pivot=pivot.next;
           }
       }
       swap(pivot,last);
       return pivot;
    }
    private static void swap(Node first,Node second){
        int temp=first.data;
        first.data=second.data;
        second.data=temp;
    }