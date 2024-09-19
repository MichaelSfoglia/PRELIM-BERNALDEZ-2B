package programpack;

public class Accounts{
    int id;
    String name, mail, pass;
    
    public void addAcc(int p_id, String p_name, String p_mail, String p_pass){
        this.id = p_id;
        this.name = p_name;
        this.mail = p_mail;
        this.pass = p_pass;
    }
    
    public void accOut(){
        System.out.println(this.id + "");
    }
}
