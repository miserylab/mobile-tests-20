package tests;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class SampleIosTests extends TestBase  {
    @Test
    @Tag("ios")
    void textFieldTest() {
        step("Click Text Button", () ->
                $(AppiumBy.accessibilityId("Text Button")).click());
        step("Text Input", () ->
                $(AppiumBy.accessibilityId("Text Input")).sendKeys("Appium" + "\n"));
        step("Verify result", () ->
                $(AppiumBy.accessibilityId("Text Output")).shouldHave(text("Appium")));
    }
}
