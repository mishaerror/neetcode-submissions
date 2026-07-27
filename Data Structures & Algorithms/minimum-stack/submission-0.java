class MinStack {
    private List<Integer> backingList;
    private List<Integer> minsList;//helper stack, for each element we push the current minimum
    private Integer size;
    private Integer min;

    public MinStack() {
       backingList  = new ArrayList<>();
       minsList = new ArrayList<>();
       size = 0;
       min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        backingList.add(val);
        if(size == 0 || val < minsList.get(size - 1)) {
            minsList.add(val);
        } else {
          minsList.add(minsList.get(size - 1));
        }
        size++;
    }
    
    public void pop() {
        backingList.remove(size-1);
        minsList.remove(size-1);
        size--;
    }

    public int top() {
        return backingList.get(size - 1);
    }
    
    public int getMin() {
        return minsList.get(size-1);
    }
}
