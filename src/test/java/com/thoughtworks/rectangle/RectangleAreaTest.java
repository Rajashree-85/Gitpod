package com.thoughtworks.rectangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RectangleAreaTest {
 @Test
 void shouldcalcalateArea(){
   int length=3;
   int breadth=4;
   int area=RectangleArea.calculate(length, breadth);
   assertEquals(12,area);
 }   
}
