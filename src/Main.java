import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Jump_hero> jumpheroes = new ArrayList<>();
        jumpheroes.add(new Jump_hero("ONE PIECE","ルフィ",1997));
        jumpheroes.add(new Jump_hero("ドラゴンボール","孫悟空",1984));
        jumpheroes.add(new Jump_hero("ドラゴンクエストダイの大冒険","勇者ダイ",1989));
        jumpheroes.add(new Jump_hero("HUNTER☓HUNTER","ゴン＝フリークス",1998));
        jumpheroes.add(new Jump_hero("NARUTO","うずまきナルト",1999));
        jumpheroes.add(new Jump_hero("家庭教師ヒットマンリボーン","沢田綱吉",2004));
        jumpheroes.add(new Jump_hero("ワールドトリガー","空閑遊馬",2013));

        System.out.println("<天下一武道会参加者一覧>");
        for (Jump_hero jumphero : jumpheroes){
            System.out.println("作品:" + jumphero.getTitle());
            System.out.println("出場者:" + jumphero.getLeader());
            System.out.println("連載開始:" + jumphero.getYear()+"年");
        }
        System.out.println("天下一武道会参加抽選結果");
        System.out.println("当選者");
        for (Jump_hero jumphero : jumpheroes){
            if (jumphero.getYear() <=2000){
                System.out.println(jumphero.getLeader());
            }
        }
    }
}

