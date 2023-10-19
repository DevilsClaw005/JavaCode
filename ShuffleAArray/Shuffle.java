public class Shuffle {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        shuffle(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }

    public static void shuffle(int [] array){
        int index,temp;
        for(int i=array.length-1;i>=0;i--){
            index = (int) (Math.random() * (i+1));
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}
