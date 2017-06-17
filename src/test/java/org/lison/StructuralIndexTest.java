package org.lison;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.BitSet;

public class StructuralIndexTest {
    @Test
    public void buildStructuralCharacterBitmaps() throws UnsupportedEncodingException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String jsonRecordString = "{\"id\":\"id:\\\"a\\\"\", \"reviews\":50, \"attributes\":{\"breakfast\":false, \"lunch\":true, \"dinner\":true, \"latenight\":true},\"categories\":[\"Restaurant\", \"Bars\"], \"state\":\"WA\", \"city\":\"seattle\"}";
        byte[] jsonRecord = jsonRecordString.getBytes("UTF-8");
        Method method = StructuralIndex.class.getDeclaredMethod("buildStructuralCharacterBitmaps", byte[].class);
        method.setAccessible(true);
        BitSet[] structuralCharacterBitmaps = (BitSet[])method.invoke(null, jsonRecord);
        System.out.println(jsonRecordString);
        for (int i = 0; i < structuralCharacterBitmaps.length; i++) {
            System.out.println(structuralCharacterBitmaps[i]);
        }
    }
}
