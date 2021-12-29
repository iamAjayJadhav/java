class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks)
    {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public static void main(String[] args)
    {
        Student S1 = new Student(1, "Ajay", 65);
        System.out.println("id :" + S1.id);
        System.out.println("name :" + S1.name);
        System.out.println("marks :" + S1.marks);

        System.out.println("####################################################################");

        Student S2 = new Student(1, "sheela", 55);
        System.out.println("id :" + S2.id);
        System.out.println("name :" + S2.name);
        System.out.println("marks :" + S2.marks);
        System.out.println("####################################################################");

        Student S3 = new Student(5, "leela", 45);
        System.out.println("id :" + S3.id);
        System.out.println("name :" + S3.name);
        System.out.println("marks :" + S3.marks);

    }
}