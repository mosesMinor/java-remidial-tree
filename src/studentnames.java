
import java.util.ArrayList;

public class studentnames {
    public static void main(String[] args) {
        ArrayList<studentconstructor> majina;
//instantiate the array list
        majina=new ArrayList<>();
//create the list item using the constructor
        studentconstructor std1 =new studentconstructor("kariuki","victor","Boru");
        studentconstructor std2 =new studentconstructor("joshua","ndeleva","mwangi");
        studentconstructor std3 =new studentconstructor("Endwin","victor","Mumo");
        studentconstructor std4 =new studentconstructor("chris","nyaga","kamari");
//Add your student names to your array list
        majina.add(std1);
        majina.add(std2);
        majina.add(std3);
        majina.add(std4);

//finally print your array list using your tostring function
        System.out.println(majina.toString());
    }
}