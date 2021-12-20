package com.example.calculatorapp;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void mainActivityTest() {
        ViewInteraction materialButton = onView(
                allOf(withId(R.id.btnRoot), withText("sqrt()"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tableLayout),
                                        0),
                                2),
                        isDisplayed()));
        materialButton.perform(click());

        ViewInteraction materialButton2 = onView(
                allOf(withId(R.id.btnNum9), withText("9"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tableLayout),
                                        1),
                                2),
                        isDisplayed()));
        materialButton2.perform(click());

        ViewInteraction materialButton3 = onView(
                allOf(withId(R.id.btnParenthesis), withText("()"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tableLayout),
                                        0),
                                1),
                        isDisplayed()));
        materialButton3.perform(click());

        ViewInteraction materialButton4 = onView(
                allOf(withId(R.id.btnAdd), withText("+"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tableLayout),
                                        2),
                                3),
                        isDisplayed()));
        materialButton4.perform(click());

        ViewInteraction materialButton5 = onView(
                allOf(withId(R.id.btnNum5), withText("5"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tableLayout),
                                        2),
                                1),
                        isDisplayed()));
        materialButton5.perform(click());

        ViewInteraction materialButton6 = onView(
                allOf(withId(R.id.btnMultiply), withText("�"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tableLayout),
                                        1),
                                3),
                        isDisplayed()));
        materialButton6.perform(click());

        ViewInteraction materialButton7 = onView(
                allOf(withId(R.id.btnNum2), withText("2"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tableLayout),
                                        3),
                                1),
                        isDisplayed()));
        materialButton7.perform(click());

        ViewInteraction materialButton8 = onView(
                allOf(withId(R.id.btnSubtract), withText("-"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tableLayout),
                                        3),
                                3),
                        isDisplayed()));
        materialButton8.perform(click());

        ViewInteraction materialButton9 = onView(
                allOf(withId(R.id.btnNum3), withText("3"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tableLayout),
                                        3),
                                2),
                        isDisplayed()));
        materialButton9.perform(click());

        ViewInteraction materialButton10 = onView(
                allOf(withId(R.id.btnDivide), withText("�"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tableLayout),
                                        0),
                                3),
                        isDisplayed()));
        materialButton10.perform(click());

        ViewInteraction materialButton11 = onView(
                allOf(withId(R.id.btnNum2), withText("2"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tableLayout),
                                        3),
                                1),
                        isDisplayed()));
        materialButton11.perform(click());

        ViewInteraction materialButton12 = onView(
                allOf(withId(R.id.btnPlusMinus), withText("+/-"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tableLayout),
                                        4),
                                0),
                        isDisplayed()));
        materialButton12.perform(click());

        ViewInteraction materialButton13 = onView(
                allOf(withId(R.id.btnPlusMinus), withText("+/-"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tableLayout),
                                        4),
                                0),
                        isDisplayed()));
        materialButton13.perform(click());

        ViewInteraction appCompatImageButton = onView(
                allOf(withId(R.id.btnBackspace),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        appCompatImageButton.perform(click());

        ViewInteraction materialButton14 = onView(
                allOf(withId(R.id.btnNum6), withText("6"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tableLayout),
                                        2),
                                2),
                        isDisplayed()));
        materialButton14.perform(click());

        ViewInteraction materialButton15 = onView(
                allOf(withId(R.id.btnAdd), withText("+"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tableLayout),
                                        2),
                                3),
                        isDisplayed()));
        materialButton15.perform(click());

        ViewInteraction materialButton16 = onView(
                allOf(withId(R.id.btnNum1), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tableLayout),
                                        3),
                                0),
                        isDisplayed()));
        materialButton16.perform(click());

        ViewInteraction materialButton17 = onView(
                allOf(withId(R.id.btnNum3), withText("3"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tableLayout),
                                        3),
                                2),
                        isDisplayed()));
        materialButton17.perform(click());

        ViewInteraction materialButton18 = onView(
                allOf(withId(R.id.btnPoint), withText("."),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tableLayout),
                                        4),
                                2),
                        isDisplayed()));
        materialButton18.perform(click());

        ViewInteraction materialButton19 = onView(
                allOf(withId(R.id.btnNum2), withText("2"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tableLayout),
                                        3),
                                1),
                        isDisplayed()));
        materialButton19.perform(click());

        ViewInteraction materialButton20 = onView(
                allOf(withId(R.id.btnSubtract), withText("-"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tableLayout),
                                        3),
                                3),
                        isDisplayed()));
        materialButton20.perform(click());

        ViewInteraction materialButton21 = onView(
                allOf(withId(R.id.btnNum1), withText("1"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tableLayout),
                                        3),
                                0),
                        isDisplayed()));
        materialButton21.perform(click());

        ViewInteraction materialButton22 = onView(
                allOf(withId(R.id.btnNum0), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tableLayout),
                                        4),
                                1),
                        isDisplayed()));
        materialButton22.perform(click());

        ViewInteraction materialButton23 = onView(
                allOf(withId(R.id.btnEquals), withText("="),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tableLayout),
                                        4),
                                3),
                        isDisplayed()));
        materialButton23.perform(click());

        ViewInteraction editText = onView(
                allOf(withId(R.id.edInput), withText("8.7"),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        editText.check(matches(withText("8.7")));

        ViewInteraction materialButton24 = onView(
                allOf(withId(R.id.btnClear), withText("C"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tableLayout),
                                        0),
                                0),
                        isDisplayed()));
        materialButton24.perform(click());
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
