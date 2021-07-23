package classandkotlin;

public class Gun {
    public Gun(String name) {
        this.name = name;
    }

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String showInfo() {
        return "this is gun:" + name;
    }

    //java代码中调用kotlin代码
    public static void main(String[] args) {
//        System.out.println(HeroKt.showInfoFromKotlin());
        System.out.println(Hero.showInfoFromKotlin());
    }
}
