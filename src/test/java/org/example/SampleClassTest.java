package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleClassTest {

    @Test
    void sampleTest() {
              final int CHOSEN_NUMBER = 5;
              SampleClass sampleClass = new SampleClass(CHOSEN_NUMBER);
              assertEquals(CHOSEN_NUMBER, sampleClass.getNumber());
    }

}