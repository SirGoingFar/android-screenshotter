package com.designpavilion.lib.android_screenshotter

import android.os.Bundle
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import tools.fastlane.screengrab.Screengrab
import tools.fastlane.screengrab.UiAutomatorScreenshotStrategy
import tools.fastlane.screengrab.locale.LocaleTestRule

@RunWith(JUnit4::class)
class TakeScreenshotsUnitTest {

    @get:Rule
    val localeTestRule = LocaleTestRule()

    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java, Bundle())

    fun setUp(){
        //Better screenshot capturing
        Screengrab.setDefaultScreenshotStrategy(UiAutomatorScreenshotStrategy())
    }

    @Test
    fun testTakeScreenshot() {
        Screengrab.screenshot("after_button_click")
    }
}