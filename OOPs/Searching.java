public class Searching {
    public static void main(String[] args) {
        int [] arr = {1,4,7,10,12,23,34,45,57,73,86,90,96,124,345}; // 11 /2 = 5
        int element = 65;
        System.out.println(binarySearch(arr , element));
    }

    public static int binarySearch(int [] arr , int element){

        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2 ;
            if(arr[mid] < element){
                start = mid+1;
            }
            else if(arr[mid] > element){
                end = start-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
