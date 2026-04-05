
package spring.hib.soft;




public class Admin {
    private String adminid;
    private String password;
    private String email;
    private String contact;

    public Admin() {
    }

    public Admin(String adminid, String password, String email, String contact) {
        this.adminid = adminid;
        this.password = password;
        this.email = email;
        this.contact = contact;
    }

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
}
