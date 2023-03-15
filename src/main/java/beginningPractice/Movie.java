package beginningPractice;

public enum Movie {

    COMEDY(2, "funny"),THRILLER(1, "scary") , ACTION(5, "fast"),CARTOONS(9, "kids"),MILITARY(3, "old");

    private final int num;
    private final String name;

    Movie(int num, String name){
        this.num = num;
        this.name = name;

    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }
}

