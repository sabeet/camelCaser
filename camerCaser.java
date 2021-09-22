public class camelCaser {
    public static void main(String[] args) {
        String line = "wHat\nIs\n\ncAmElcASe";
        System.out.println(camelCase(line));
    }

    public static String camelCase(String s){
        String res = "";
        boolean r = true;
        //lowercase it all
        s = s.toLowerCase();
        //turn it into an array/list
        String[] s_list = s.split("\n");
        //with double /n, replace empty with " "
        for(int i = 0; i < s_list.length; i++){
            if(s_list[i].equals("")){
                res += " ";
                r = true;
            } else if (!r){
                res += s_list[i].substring(0,1).toUpperCase() + s_list[i].substring(1);
            } else {
                res += s_list[i];
                r = false;
            }
        }

        return res;
    }

}
