package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_Steps  {

    @Given("Amazon sitesie git")
    public void amazon_sitesie_git() throws Throwable {

        System.out.println("Siteye Gidildi");
}

    @Given("login butonuna tıkla")
    public void login_butonuna_tıkla()throws Throwable {

        System.out.println("Butona Basıldı");

    }

    @Given("isim gir")
    public void isim_gir() throws Throwable{
        System.out.println("isim Girildi");

    }

    @Given("sifre gir")
    public void sifre_gir()throws Throwable {
        System.out.println("Sifre Girildi");

    }

    @When("submit butonuna tikladiginda")
    public void submit_butonuna_tikladiginda()throws Throwable {
        System.out.println("Submit butonuna Basıldı");

    }

    @Then("success mesajini gör")
    public void success_mesajini_gör()throws Throwable {
        System.out.println("Mesaj Görüldü, İşlem Başarıyla Tamamlandı");

    }


}
