package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

public class RectangleTest {
 @Test
 void shouldCalculateAreaWhenLengthAndBreadthIsGiven(){
   Rectangle area=new Rectangle(3,4);
   int areaCalculated=area.calculate();
   assertThat(areaCalculated,equalTo(12));
 }    
}
