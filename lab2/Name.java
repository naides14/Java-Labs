public class Name { //для задачи 1
    public String surname;
    public String pname;
    public String lastname;

    public Name(String pname) {
        this.pname=pname;
        //this(null, pname, null)

    }
    public Name(String surname,String pname,String lastname) {
        this.surname=surname;
        this.pname=pname;
        this.lastname=lastname;
    }
    public Name(String surname,String pname) {
        this.surname=surname;
        this.pname=pname;

    }

    public String toString() {
        if (surname==null&lastname==null){
            return pname;
        }
        else if (lastname==null) {
            return surname+" " + pname;
        }
        else {
            return surname+" "+pname+" "+lastname;
        }
    }

}
