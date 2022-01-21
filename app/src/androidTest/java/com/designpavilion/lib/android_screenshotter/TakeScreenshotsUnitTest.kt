package com.designpavilion.lib.android_screenshotter

import android.os.Bundle
import android.view.View
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.isRoot
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Before
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
    val activityScenarioRule = ActivityScenarioRule(FragmentContainerActivity::class.java, Bundle().apply {
        putInt(FragmentContainerActivity.START_DESTINATION, R.id.screenTwoFragment)
    })

    @Before
    fun setUp() {
        //Better screenshot capturing
        Screengrab.setDefaultScreenshotStrategy(UiAutomatorScreenshotStrategy())
    }

    @Test
    fun testTakeScreenTwoShot() {
        onView(isRoot()).perform(waitFor(2000))
        Screengrab.screenshot("Screen_Two")
    }

    fun waitFor(delay: Long): ViewAction {
        return object : ViewAction {
            override fun getConstraints() = isRoot()
            override fun getDescription(): String = "wait for $delay milliseconds"
            override fun perform(uiController: UiController, v: View?) {
                uiController.loopMainThreadForAtLeast(delay)
            }
        }
    }

}