public class Student {
    private String name;
    private Type type;
    private boolean csbasicsDebt, programmingDebt;

    public Student(String name, Type type, boolean csbasicsDebt, boolean programmingDebt) {
        this.name = name;
        this.type = type;
        this.csbasicsDebt = csbasicsDebt;
        this.programmingDebt = programmingDebt;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public boolean hasCsbasicsDebt() {
        return csbasicsDebt;
    }

    public boolean hasProgrammingDebt() {
        return programmingDebt;
    }
}
