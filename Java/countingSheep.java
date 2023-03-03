public class countingSheep {
    public static String countingSheeps(int num) {
        //Add your code here
        StringBuilder string=new StringBuilder();
        for(int i=1;i<=num;i++){
          string.append(i+" sheep...");
        }
        return string.toString();
      }
      
    }

