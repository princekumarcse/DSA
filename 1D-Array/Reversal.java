//time complexity O(n) 
//space complexity O(1)
class Reversal{
    public static void main(String[] args){
        int arr[]={2,3,4,5,6,7,8};
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        System.out.println("Reversal Array is: ");
        for(int i=0;i<n;i++){
            
            System.out.print(arr[i]+" ");
        }
    }
}