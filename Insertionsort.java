public class Insertionsort{
    public static void main(String args[])  throws ArrayIndexOutOfBoundsException{
        int arr[] = {3,6,2,1,5};

        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            try{
                while(arr[j] > key && j>=0){
                arr[j+1] = arr[j];
                j--;
                }
            }catch(Exception e){

            }
            
            arr[j+1] = key;
        }
        for (int num : arr){
            System.out.print(num + " ");
        }
    }       
}
