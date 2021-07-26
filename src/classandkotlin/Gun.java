package classandkotlin;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

import java.io.IOException;

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
//        System.out.println(Hero.showInfoFromKotlin());

        //java调用kotlin代码属性 通过在kotiln添加注解JvmField使当前调用
        SpellBook spellBook = new SpellBook();
//        spellBook.getSpells();
//       for (String spell :spellBook.spells){
//           System.out.println(spell);
//       }

        //java调用kotlin代码方法 通过在kotiln添加注解@JvmOverloads使当前调用
//        Hero.handOverFood("banner");

        //java调用kotlin代码伴生对象 通过在kotiln添加注解@JvmField、@JvmStatic使当前调用
//        SpellBook.Companion.getSpellbookGreeting();
//        System.out.println(SpellBook.Companion.getMAX_SPELL_COUNT());
//        System.out.println(SpellBook.MAX_SPELL_COUNT);
//        SpellBook.getSpellbookGreeting();

        //涉及到java调用kotlin方法抛异常情况，在kotlin代码中使用@Throws，这样java调用方法是会捕捉异常
//        try {
//            spellBook.accecptException();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //java调用kotlin中的匿名函数
        Function1<String, Unit> getInfoAboutFun = Hero.getGetInfoAboutFun();
        getInfoAboutFun.invoke("ROSE");
    }
}
