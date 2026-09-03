public class CSStudent {
  private String name;
  private int id;
    private Stirng username;

  public CSStudent(String name, int id, String username) {
    this.name = name;

    if (id < 0) {
            //throw exception
    }
    this.id = id;
    this.username = username;
  }

  public Student() {
        this.name = "new student";
        this.id = 0;   
  }

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  public String toString() {
    return name+" "+id;
  }

  public static void main(String[] args) {
      Student s = new Student("Elizabeth", 211897);
      System.out.println(s);
  }

 }
