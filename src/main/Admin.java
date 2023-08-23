package main;
public class Admin extends User{
    private String id;
    private int pass;
    public Admin(String id, int pass) {
        setID(id);
        setPass(pass);
    }
    @Override
    void setID(String Id) {
        Id=id;
    }
    @Override
    void setPass(int Pass) {
        Pass=pass;
    }

    public String getId() {
        return id;
    }

    public int getPass() {
        return pass;
    }
    
}
