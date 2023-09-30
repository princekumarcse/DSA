//time complexity O(n)
//space complexity O(1)
class Palindrome{
    public static void main(String args[]){
        int arr[]={1,2,3,2,1};
        int n=arr.length;
        int flag=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=arr[n-1-i]){
                flag=1;
                System.out.println("Given Array is not a Plaindrome");
                break;
            }
        }
        if(flag==0){
            System.out.println("Given array is Plindrome");
        }
    }
}