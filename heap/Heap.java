package heap;

import java.util.ArrayList;

class Heap<T extends Comparable<T>>{
    private ArrayList<T> list;

    public Heap(){
        list = new ArrayList<>();
    }

    private void swap(int firstIndex, int secondIndex){
        T temp = list.get(firstIndex);
        list.set(firstIndex, list.get(secondIndex));
        list.set(secondIndex, temp);
    }

    private int parent(int index){
        return (index - 1) / 2;
    }

    private int left(int index){
        return (index * 2) + 1;
    }

    private int right(int index){
        return (index * 2) + 2;
    }

    public void insert(T value){
        list.add(value);
        upHeap(list.size() - 1);
    }

    private void upHeap(int index){
        if(index == 0){
            return;
        }
        int p = parent(index);
        if(list.get(index).compareTo(list.get(p)) < 0){
            swap(index, p);
            upHeap(p);
        }
    }

    public T remove() throws Exception {
        if(list.isEmpty()){
            throw new Exception("Operation is invalid since, list is empty ");
        }

        T temp = list.get(0);
        T last = list.remove(list.size() - 1);
        if(!list.isEmpty()){
            list.set(0, last);
            downHeap(0);
        }
        return temp;
    }

    private void downHeap(int index){
        int min = index;
        int left = left(index);
        int right = right(index);

        if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0){
            min = left;
        }

        if(min != index){
            swap(min, index);
            downHeap(min);
        }
    }

    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> list = new ArrayList<>();
        
        while(!list.isEmpty()){
            list.add(this.remove());
        }

        return list;
    }
}