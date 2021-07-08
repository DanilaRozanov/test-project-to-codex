package entity;


import javax.persistence.*;

@Entity
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue
    @Column ( name = "user_id", nullable = false )
    private long id ;

    @Column ( name = "user_nicname" )
    private String nicname;

    @Column ( name = "user_password")
    private String password;

    @Column ( name = "user_email")
    private String email;

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNicname() {
        return nicname;
    }

    public void setNicname(String nicname) {
        this.nicname = nicname;
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

    @OneToOne(optional = false, mappedBy="user")
    public RoleMap roleMap;
}
