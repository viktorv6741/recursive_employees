package recursion;

public class RecursionTest {
    public static void main(String[] args) {

///////////////////////////////////////////////////////////////////////////////////

        Employer employer = new Employer(
                new Employer(
                        new Employer(
                                new Employer(),
                                "ChiefEng", "SomeCompany", "name_1"
                        ), "SecondEng", "SomeCompany", "name_2"),
                "ThirdEng", "SomeCompany", "name_3");

///////////////////////////////////////////////////////////////////////////////////

        System.out.println(employer.toString());

///////////////////////////////////////////////////////////////////////////////////

    }
}
