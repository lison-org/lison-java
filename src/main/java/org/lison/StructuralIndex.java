package org.lison;

import java.io.UnsupportedEncodingException;
import java.util.BitSet;

class StructuralIndex {
    private static final byte BACKSLASH_BYTE = 0x5c;
    private static final byte QUOTE_BYTE = 0x22;
    private static final byte COLON_BYTE = 0x3a;
    private static final byte OPENING_BRACE_BYTE = 0x7b;
    private static final byte CLOSING_BRACE_BYTE = 0x7d;
    private static final byte[] STRUCTURAL_CHARACTER_BYTES = {
            BACKSLASH_BYTE,
            QUOTE_BYTE,
            COLON_BYTE,
            OPENING_BRACE_BYTE,
            CLOSING_BRACE_BYTE
    };

    private byte[] jsonRecord;
    private BitSet[] structuralCharacterBitmaps;

    StructuralIndex(String jsonRecordString) throws UnsupportedEncodingException {
        jsonRecord = jsonRecordString.getBytes("UTF-8");
        structuralCharacterBitmaps = buildStructuralCharacterBitmaps(jsonRecord);
    }

    private static BitSet[] buildStructuralCharacterBitmaps(byte[] jsonRecord) {
        BitSet[] structuralCharacterBitmaps = new BitSet[STRUCTURAL_CHARACTER_BYTES.length];
        for (int i = 0; i < structuralCharacterBitmaps.length; i++) {
            structuralCharacterBitmaps[i] = new BitSet(jsonRecord.length);
        }
        for (int i = 0; i < jsonRecord.length; i++) {
            for (int j = 0; j < STRUCTURAL_CHARACTER_BYTES.length; j++) {
                if (jsonRecord[i] == STRUCTURAL_CHARACTER_BYTES[j]) {
                    structuralCharacterBitmaps[j].set(i);
                    break;
                }
            }
        }
        return structuralCharacterBitmaps;
    }

}
