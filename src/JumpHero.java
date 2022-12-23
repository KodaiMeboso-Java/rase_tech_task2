public class JumpHero {
    //フィールド
    private final String title;
    private final String leader;
    private final int year;

    //コンストラクタ
    public JumpHero(String title , String leader , int year) {
        this.title = title;
        this.leader = leader;
        this.year = year;
    }
    //メソッド
    public  String getTitle(){
        return title;
    }
    public String getLeader() {
        return leader;
    }
    public int getYear(){
        return year;
    }
}
