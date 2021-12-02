```
   #
  ##
 ###
####
```
class Result {

    public static void staircase(int n) {
    // Write your code here
        int blank=n-1;
        int sharp=1;
        while(n>0){
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<blank;i++ ){
                sb.append(" ");
            }
            for(int j=0;j<sharp;j++ ){
                sb.append("#");
            }
            System.out.println(sb.toString());
            n--;
            blank--;
            sharp++;
        }
    }

}
