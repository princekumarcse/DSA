//time complexity O(n)
//Space Complexity O(1)
class MissingNumber{
    public static void main(String[] args){
        int arr[]={1,2,3,4,7,6,5,9};
        int m=arr.length;
        int n=m+1;
        int sumOfCurrArray=0;
        int sumOfOriginal=(n*(n+1))/2;
        for(int i=0;i<m;i++){
            sumOfCurrArray+=arr[i];
        }

        int MissingNumber=sumOfOriginal-sumOfCurrArray;
        System.out.println("Missing Number is: "+MissingNumber);

    }
}