public class Student {
    private String studentName, studentClass;
    private byte studentAge;
    public Student(String name, String sClass, byte age){
        this.studentName = name;
        this.studentClass = sClass;
        this.studentAge = age;
    }
    public void setName(String name){
        this.studentName = name;
    }
    public void setClass(String sClass){
        this.studentClass = sClass;
    }
    public void setAge(byte age){
        this.studentAge = age;
    }
    public String getStudentName (){
        return this.studentName;
    }
    public String getStudentClass(){
        return this.studentClass;
    }
    public byte getStudentAge(){
        return this.studentAge;
    }
}
