
public class studentconstructor {
    String fname,sname,lname;

    public studentconstructor(String fname, String sname, String lname) {
        this.fname = fname;
        this.sname = sname;
        this.lname = lname;
    }

    @Override
    public String toString() {
        return fname+sname+lname;
    }
}