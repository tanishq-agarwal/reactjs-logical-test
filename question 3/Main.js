function printRepeating(arr , size)
    {
        var i, j;
        document.write("Repeated Element is :");
        for (i = 0; i < size; i++)
        {
            for (j = i + 1; j < size; j++)
            {
                if (arr[i] == arr[j])
                    document.write(arr[i] + " ");
            }
        }
    }
 
var arr = [0,1,2,3,4,5,6,7,7,8,9,10];
var arr_size = arr.length;
printRepeating(arr, arr_size);
 
