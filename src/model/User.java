
public class User{
  private String name;
  private String email;
  private License license;

  public User(String name, String email, License license){
    this.name = name;
    this.email = email;
    this.license = license;
  }

  @Override
  public String toString(){
    return "User: " + name + "\n"
       + " Email: " + email + "\n"
       + "License: " + license
       + "\n" ;
  }
}
