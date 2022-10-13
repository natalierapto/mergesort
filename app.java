import java.util.ArrayList;
import java.util.Random;

public class App{
    
    public static void main(String[] args) throws Exception{
        int arrayLength = 5;
        ArrayList<Integer> arrayList = new ArrayList<>(arrayLength);
        Random random = new Random();
        for (int i = 0; i < arrayLength; i ++){
            arrayList.add(random.nextInt(100));
        }
        System.out.println(arrayList.toString());
        Sort.mergeSort(arrayList);
        System.out.println(arrayList);
        System.out.println(sort.isSorted(arrayList));
    }
}
