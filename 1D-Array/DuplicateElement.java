//time complexity: O(n2)
//space compexity: O(1)
class DuplicateElement{
    public static void main(String[] args){
        int arr[]={2,3,4,4,7,9,10,10};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate Array Element is: "+arr[i]);
                }
            }
        }
    }
}