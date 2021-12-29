class StudentThreeJN {
    int id;
    String name;
    double marks;

    StudentThreeJN(int id, String name, double marks)
    {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public static void main(String[] args)
    {
        StudentThreeJN S1 = new StudentThreeJN(1, "Ajay", 65);
        System.out.println("id :" + S1.id);

    }
}