package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class HomeUI extends PageObject {

    public static final Target HOME = Target.the("Home").
            locatedBy("/html/body/header/nav/div/a");

    public static final Target SPEAKERS = Target.the("Speakers").
            located(By.xpath("//*[@id=\"speakersImg\"]"));

    public static final Target TABLETS = Target.the("Tablets").
            located(By.xpath("//*[@id=\"tabletsImg\"]"));

    public static final Target LAPTOPS = Target.the("Laptops").
            located(By.xpath("//*[@id=\"laptopsImg\"]"));

    public static final Target MICE = Target.the("Mice").
            located(By.xpath("//*[@id=\"miceImg\"]"));

    public static final Target HEADPHONES = Target.the("Headphones").
            located(By.xpath("//*[@id=\"headphonesImg\"]"));

    public static final Target ROAR_MINI_WIRELESS = Target.the("Roar_Mini_Wireless").
            locatedBy("/html/body/div[3]/section/article/div[3]/div/div/div[2]/ul/li[3]");
            //*[@id="24"]

    public static final Target PRICE_ROAR_MINI_WIRELESS = Target.the("Price_Roar_Mini_Wireless").
            located(By.xpath("//*[@id=\"Description\"]/h2"));

    public static final Target ADD_TO_CART = Target.the("Add_to_cart").
            located(By.xpath("//*[@id=\"productProperties\"]/div[4]/button"));

    public static final Target SCULPT_TOUCH_MOUSE = Target.the("Sculp_Touch_Mouse").
            locatedBy("/html/body/div[3]/section/article/div[3]/div/div/div[2]/ul/li[9]");

    public static final Target PRICE_SCULPT_TOUCH_MOUSE = Target.the("Price_Sculpt_Touch_Mouse").
            locatedBy("/html/body/div[3]/section/article/div[3]/div/div/div[2]/ul/li[9]/p[2]/a");

    public static final Target MENU_CART = Target.the("Add_to_cart").
            located(By.xpath("//*[@id=\"menuCart\"]"));

    public static final Target REMOVE_1 = Target.the("Add_to_cart").
            located(By.xpath("//*[@id=\"shoppingCart\"]/table/tbody/tr[1]/td[6]/span/a[3]"));

    public static final Target CHECKOUT = Target.the("Add_to_cart").
            located(By.xpath("//*[@id=\"checkOutButton\"]"));

   }
