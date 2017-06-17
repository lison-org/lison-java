package org.lison;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.BitSet;

import static org.junit.Assert.assertEquals;

public class StructuralIndexTest {
    @Test
    public void buildStructuralCharacterBitmaps() throws UnsupportedEncodingException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        final String jsonRecordString = "{\"id\":\"id:\\\"a\\\"\", \"reviews\":50, \"attributes\":{\"breakfast\":false, \"lunch\":true, \"dinner\":true, \"latenight\":true},\"categories\":[\"Restaurant\", \"Bars\"], \"state\":\"WA\", \"city\":\"seattle\"}";
        final byte[] jsonRecord = jsonRecordString.getBytes("UTF-8");
        final String[] expecteds = {
                "{10, 13}",
                "{1, 4, 6, 11, 14, 15, 18, 26, 32, 43, 46, 56, 65, 71, 79, 86, 94, 104, 112, 123, 126, 137, 140, 145, 149, 155, 157, 160, 163, 168, 170, 178}",
                "{5, 9, 27, 44, 57, 72, 87, 105, 124, 156, 169}",
                "{0, 45}",
                "{110, 179}"
        };
        Method method = StructuralIndex.class.getDeclaredMethod("buildStructuralCharacterBitmaps", byte[].class);
        method.setAccessible(true);
        BitSet[] structuralCharacterBitmaps = (BitSet[])method.invoke(null, jsonRecord);
        for (int i = 0; i < structuralCharacterBitmaps.length; i++) {
            assertEquals(expecteds[i], structuralCharacterBitmaps[i].toString());
        }
    }
}
