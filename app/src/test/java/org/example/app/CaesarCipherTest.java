package org.example.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CaesarCipherTest {

    CaesarCipher caesarCipher = new CaesarCipher();

    @Test
    void testCipheredMessageOffsetBy12(){
        assertEquals("za yq sgefm qx pqemddaxxa pq earfimdq", caesarCipher.cipher("no me gusta el desarrollo de software", 12));
    }

    @Test
    void testEmptyString(){
        assertEquals("", caesarCipher.cipher("", 12));
    }

    @Test
    void testCipheredMessageOffsetBy12Fail(){
        assertEquals("za yq sgefm qx pqemddaxxa pq earfimdq", caesarCipher.cipher("no me gusta el desarrollo de software", 11));
    }

    
}
