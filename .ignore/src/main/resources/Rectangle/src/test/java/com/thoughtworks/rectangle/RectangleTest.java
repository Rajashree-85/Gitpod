package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

import org.junit.jupiter.api.Test;

public class RectangleTest {
  
 @Test
 void shouldCalculateAreaWhenLengthAndBreadthIsGiven(){
   Rectangle area=new Rectangle(10.5,5.5);
   double areaCalculated=area.area();
   assertThat(areaCalculated,closeTo(57.75,0.001));
 }    

 @Test
 void shouldCalculatePerimeterWhenLengthAndBreadthIsGiven(){
  Rectangle perimeter=new Rectangle(10.5,5.5);
  double perimeterCalculated=perimeter.perimeter();
  assertThat(perimeterCalculated,closeTo(32.0, 0.001));
 }

}

