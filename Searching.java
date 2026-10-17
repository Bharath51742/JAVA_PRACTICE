 class Searching {
    
    public static void main(String[] args) {
        int arr[] ={10,20,30,40,50};
        int key=30 ;
        int pos=-1;
        for(int i=0;i<=arr.length;i++){
            if(arr[i]==key){
                 pos=i;
                break;
            }

        }
        if(pos!=-1){
            System.out.println("element is found at index" + pos);
        

            }
            else{
                System.out.println("element not found index" +pos);
            }

        }
    }
 

        


    

