class Solution {
    public void sortColors(int[] a) {
       int i=0;
       int j=0;
       int k=a.length-1;
       
       while(j<=k){
           if(a[j]==1){
               j++;
           }else if(a[j]==2){
               int temp=a[j];
               a[j]=a[k];
               a[k]=temp;
              
               k--;
           }else{
               int temp1=a[i];
               a[i]=a[j];
               a[j]=temp1;
               i++;
               j++;
           }
       }
    }
}