package com.designpavilion.lib.android_screenshotter

import android.os.Bundle
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import tools.fastlane.screengrab.locale.LocaleTestRule

import org.junit.ClassRule
import org.junit.Rule
import org.junit.runners.JUnit4
import tools.fastlane.screengrab.Screengrab
import tools.fastlane.screengrab.UiAutomatorScreenshotStrategy







/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(JUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    val localeTestRule = LocaleTestRule()

    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java, Bundle())

    fun setUp(){
        //Better screenshot capturing
        Screengrab.setDefaultScreenshotStrategy(UiAutomatorScreenshotStrategy())
    }

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.designpavilion.lib.android_screenshotter", appContext.packageName)
    }

    @Test
    fun testTakeScreenshot() {
        Screengrab.screenshot("after_button_click")
    }


}