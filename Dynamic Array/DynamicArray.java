public class DynamicArray {

    private int [] data;
    private int nextIndex;

    public DynamicArray(){
        data = new int [5];
        nextIndex = 0;
    }

    public int size(){
        return nextIndex;
    }

    public void capacity(){
        int newArray[] = data;
        data = new int [2*newArray.length];
        for(int i=0; i<newArray.length; i++){
            data[i] = newArray[i];
        }
    }

    public void add(int element){
        if(nextIndex == data.length){
            capacity();
        }
        data[nextIndex] = element;
        nextIndex++;
    }

    public void set(int index , int element){
        if(index > nextIndex){
            return;
        }
        if(index < nextIndex){
            data[index] = element;
        }
        else{
            add(element);
            //  we can add this by add function to handle all conditions
        }
    }

    public int get(int index){
        if(index >= nextIndex){
            // TODO Error Out
            return -1;
        }
        return data[index];
    }
    
    public boolean isEmpty(){
        return (size()==0);
    }

    public int removeLast(){
        if(size() == 0){
            // TODO Error Out
            return-1;
        }
        int ans = data[nextIndex-1];
        data[nextIndex-1] =0;
        nextIndex--;
        return ans;
    }

}
