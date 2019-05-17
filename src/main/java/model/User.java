package model;

import java.io.Serializable;

public class User implements Serializable {
    private int uid;
    private String uname;
    private String upassword;
    private String uaddress;
    private String unumber;
    private String uemail;

    public User() {
    }

    public User(String uname, String upassword, String uaddress, String unumber, String uemail) {
        this.uname = uname;
        this.upassword = upassword;
        this.uaddress = uaddress;
        this.unumber = unumber;
        this.uemail = uemail;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress;
    }

    public String getUnumber() {
        return unumber;
    }

    public void setUnumber(String unumber) {
        this.unumber = unumber;
    }



    public void setUemail(String uemail) {
        this.uemail = uemail;
    }
    public String getUemail() {
        return uemail;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", uname='" + uname + '\'' +
                ", upassword='" + upassword + '\'' +
                ", uaddress='" + uaddress + '\'' +
                ", unumber='" + unumber + '\'' +
                ", uemail='" + uemail + '\'' +
                '}';
    }
}
