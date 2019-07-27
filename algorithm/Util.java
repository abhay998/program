package algorithm;

public class Util 
{
	Util obj = new Util();
	
	static  int binarySearch(int arr[], int x) 
    { 
    	// here l is left and r is right
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
        	// here m is mid and find the mid value
            int m =(int) l + (r - l) / 2; 
  
            
            if (arr[m] == x) 
                return m; 
  
            // if x value is greater than mid value
            if (arr[m] < x) 
                l = m + 1; 
  
          
            else
             // if x value is less than mid value
                r = m - 1; 
        } 
  
      
        return -1; 
    } 
	

static int binarySearch(String[] arr, String x) 
{ 
	// here l is left and r is right
    int l = 0, r = arr.length - 1; 
    while (l <= r) { 
    	// here m is mid and find the mid value
        int m = l + (r - l) / 2; 
        // here x value is comapre to mid value
        // x value what you want to search
        int res = x.compareTo(arr[m]); 

       
        if (res == 0) 
            return m; 

       
        if (res > 0) 
            l = m + 1; 

        
        else
            r = m - 1; 
    } 

    return -1; 
} 

static int[] sort(int arr[])
{ 
	// here n is find the array length 
	int n = arr.length;
	// here i value search the last-1 position
	for(int i=0;i<n-1;i++)
		for(int j=0;j<n-i-1;j++) 
			if(arr[j]>arr[j+1]) {
				// temp is variable
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
				
		return arr;
		}

static String[] sort(String[] arr,int n) {
	 String temp;
	 int i,j;
	// here i value search the last-1 position
	  for (i = 0; i < n -1; i++) 
     { 
         for ( j = 0; j < n-i-1; j++)  
         { 
             if (arr[j].compareTo(arr[j+1]) > 0) 
             { 
           	// temp is variable
                 temp = arr[j]; 
                 arr[j] = arr[j+1]; 
                 arr[j+1] = temp;
             }

     }
}        return arr;
}


static int[] insertionsort(int arr[]) 
{ 
	// heren is find the length of the array
    int n = arr.length; 
    for (int i = 1; i < n; ++i) {
        int key = arr[i]; 
        int j = i - 1; 

        /* Move elements of arr[0..i-1], that are  
        greater than key, to one position ahead  
        of their current position */  
        
        while (j >= 0 && arr[j] > key) { 
            arr[j + 1] = arr[j]; 
            j = j - 1; 
        } 
        arr[j + 1] = key; 
    } 
    return arr;
} 

static String[] insertionsort(String[] arr,int n) {
	// TODO Auto-generated method stub
// heren is find the length of the array
  // int n = arr.length; 
   for (int i = 1; i < n; ++i) {
       String key = arr[i]; 
       int j = i - 1; 

       /* Move elements of arr[0..i-1], that are  
       greater than key, to one position ahead  
       of their current position */  
       
       while (j >= 0 && arr[j].compareTo(key)>0) { 
    	   // if (arr[j].compareTo(arr[j+1]) > 0) 
           arr[j + 1] = arr[j]; 
           j = j - 1; 
       } 
       arr[j + 1] = key; 
   } 
   return arr;
} 





}

