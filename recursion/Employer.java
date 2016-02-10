package recursion;

public class Employer {

    private String name;
    private String company;
    private String role;
    private Employer boss;

///////////////////////////////////////////////////////////////////////////////////

    public Employer(Employer boss, String role, String company, String name) {
        this.name = name;
        this.role = role;
        this.boss = boss;
        this.company = company;
    }

    public Employer(){}

    public String getName() {
        return name;
    }

    public Employer getBoss() {
        return boss;
    }

    public String getRole() {
        return role;
    }

    public String getCompany() {
        return company;
    }

///////////////////////////////////////////////////////////////////////////////////

    @Override
    public String toString() {
        if (boss != null){
            return  "NAME " + name + "\n" +
                    "COMPANY " + company + "\n" +
                    "OCCUPATION " + role + "\n" +
                    "BOSS " + "\n" + boss +
                    "\n";
        }
        return ".... Infinity ....";

    }
}
