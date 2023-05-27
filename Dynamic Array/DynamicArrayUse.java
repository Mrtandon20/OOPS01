public class DynamicArrayUse {
    public static void main(String[] args) {
        DynamicArray d1 = new DynamicArray();

        for(int i=0; i<=100; i++){
            d1.add(i+10);
        }
        System.out.println(d1.size());
        System.err.println(d1.get(3));
        System.out.println(d1.get(4));
        
        while(!d1.isEmpty()){
            System.out.println(d1.removeLast());
            System.out.println("Size : " + d1.size());
        }
    }

}
