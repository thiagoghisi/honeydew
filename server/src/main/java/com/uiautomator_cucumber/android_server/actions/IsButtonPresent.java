package com.amplify.honeydew.actions;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.amplify.honeydew.Action;
import com.amplify.honeydew.Result;

import java.util.Map;

public class IsButtonPresent extends Action {
    public IsButtonPresent(UiDevice uiDevice) {
        super(uiDevice);
    }

    @Override
    public Result execute(Map<String, Object> arguments) throws UiObjectNotFoundException {
        String text = (String) arguments.get("text");
        UiObject textView = new UiObject(new UiSelector().className(android.widget.Button.class.getName()).textContains(text));
        return textView.exists() ? Result.OK : Result.FAILURE;
    }
}