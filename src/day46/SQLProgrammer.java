package day46;

// SQLProgrammer
// unique behaviour : writeSQLQuery , createDatabase()

public class SQLProgrammer extends Programmer {

    // access modifier in sub class
    // can have same visibility or more visibility
    @Override
    protected void code() {
        super.code();
        System.out.println("Writing SQL query");
    }

    @Override
    public void test() {
        super.test();
        System.out.println("Testing SQL query");
    }

    public void writeSQLQuery() {
        System.out.println("Writing SQL Query");
    }
}
