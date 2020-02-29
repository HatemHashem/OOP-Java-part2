
public class Main {


    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
       StringBuilder str=new StringBuilder();
        /*{
            1, 2, 3, 4,
                    5, 6, 7, 8,
                    9, 10
        }*/
       str.append("{");
       for(int i=0;i<t.length;i++){
          if(i%4==0){
              str.append("\n");
          }
          if(i<t.length-1) {
              str.append(" " + t[i] + ",");

          }else {
              str.append(" " + t[i]);
          }
       }
       str.append("\n"+"}");
               return str.toString();
    }

}
