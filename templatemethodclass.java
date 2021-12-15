public class templatemethod {
}
class Test1<T> {


    public void show(T arr[]) {
        for (T R : arr) {
            System.out.println(R);
        }
    }


    public static void main(String[] args) {
        String arr1[] = {"aaa", "bbb", "ccc", "ddd"};
        
        Character arr2[] = {'A', 'B', 'C', 'D', 'E'};
        
        Integer arr3[] = {10, 20, 30, 40, 50, 60, 70};
        
        Test1 obj = new Test1();
        obj.show(arr1);
        obj.show(arr2);
        obj.show(arr3);

    }

}
